package com.example.eric.taskapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View view) {
        //this code will start a new activity to view an image
        Intent intent = new Intent(this, AddNewTask.class);
        startActivity(intent);//starts tbe new activity
    }

    public void onTasksButtonClicked(View view) {
        //this code will start a new activity to view an image
        Intent intent = new Intent(this, DisplayTasksActivity.class);
        startActivity(intent);//starts tbe new activity
    }


}
