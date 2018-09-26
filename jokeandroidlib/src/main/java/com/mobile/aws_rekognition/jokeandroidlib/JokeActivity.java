package com.mobile.aws_rekognition.jokeandroidlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView tvJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        tvJoke =findViewById(R.id.tv_joke);
        tvJoke.setText(getIntent().getStringExtra("JOKE"));
        //tvJoke.setText(MyJokes.getRandomJoke());
        //new EndpointsAsyncTask().execute();
    }

//    class EndpointsAsyncTask extends AsyncTask<Context, Void, String> {
//        private MyApi myApiService = null;
//        private Context context;
//
//        @Override
//        protected String doInBackground(Context... params) {
//            if(myApiService == null) {  // Only do this once
//                MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
//                        new AndroidJsonFactory(), null)
//                        // options for running against local devappserver
//                        // - 10.0.2.2 is localhost's IP address in Android emulator
//                        // - turn off compression when running against local devappserver
//                        .setRootUrl("http://"+computerAddress+":8080/_ah/api/")
//                        .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
//                            @Override
//                            public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
//                                abstractGoogleClientRequest.setDisableGZipContent(true);
//                            }
//                        });
//                // end options for devappserver
//
//                myApiService = builder.build();
//            }
//
//            context = params[0];
//
//
//            try {
//                return myApiService.getJoke().execute().getData();
//            } catch (IOException e) {
//                return e.getMessage();
//            }
//        }
//
//        @Override
//        protected void onPostExecute(String result) {
//            String joke = result;
//            tvJoke.setText(joke);
//        }
//    }
}
