package com.udacity.gradle.builditbigger;


import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    String theJoke;

    @Test
    public void testAsyncTask() {
        theJoke = null;
        final EndpointsAsyncTask testTask = new EndpointsAsyncTask(); {
            testTask.setOnJokeResultListener(new EndpointsAsyncTask.OnJokeResultListener() {
                @Override
                public void onJokeResult(String joke) {
                    theJoke = joke;
                }
            });

        }

        // start the activity on the main thread
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                testTask.execute();
            }
        });

        // sleep for 10 seconds
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        // check if the joke landed
        synchronized (this) {
            Assert.assertFalse("The joke text is not empty", TextUtils.isEmpty(theJoke));
        }
    }
}
