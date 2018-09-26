package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mobile.aws_rekognition.jokeandroidlib.JokeActivity;
import com.udacity.gradle.builditbigger.dialog.LoadingDialog;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        Button btnTellJoke =root.findViewById(R.id.btn_tell_joke);
        btnTellJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final LoadingDialog loadingDialog =new LoadingDialog(getContext());
                loadingDialog.show();
                EndpointsAsyncTask task =new EndpointsAsyncTask();
                task.setOnJokeResultListener(new EndpointsAsyncTask.OnJokeResultListener() {
                    @Override
                    public void onJokeResult(String joke) {
                        Intent intent =new Intent(getContext(),JokeActivity.class);
                        intent.putExtra("JOKE",joke);
                        startActivity(intent);
                        loadingDialog.dismiss();
                    }
                });
                task.execute();
                //new EndpointsAsyncTask().execute();
            }
        });
        return root;
    }
}
