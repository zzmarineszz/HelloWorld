package io.designcoder.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Look thid id the layout file I am linking.
        setContentView(R.layout.activity_my);
    }
}
