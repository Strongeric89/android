package com.example.eric.activitylifecycleexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //my first output
        System.out.println("in onCreate()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("in onPause()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("in onStart()");


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("in onRestart()");


    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("in onResume()");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("in onDestroy()");


    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("in onStop()");


    }
}//end mainActivity



