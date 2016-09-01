package com.example.eric.academytutorialapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;


public class MainActivity extends AppCompatActivity {

    private EditText mNameField;
    private EditText welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameField = (EditText) findViewById(R.id.enter_name);
        TextView welcome = (TextView) findViewById(R.id.welcome);
        TextView welcomeMessage = (TextView) findViewById(R.id.welcomeMessage);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/newfont.ttf");
        mNameField.setTypeface(tf);
        welcome.setTypeface(tf);
        welcomeMessage.setTypeface(tf);
    }

    //The following logic allows you to click on a buttton and display a Toast with the name of user entered
    public void onButtonClicked(View view) {
        //this code is exectuted when a button has been clicked
        String enteredName = mNameField.getText().toString();
        Toast.makeText(this, "Hello there " + enteredName, Toast.LENGTH_LONG).show();
    }//end onButtonCliced

    public void onViewImageButton(View view) {
        //this code will start a new activity to view an image
        Intent intent = new Intent(this, DisplayImageActivity.class);
        startActivity(intent);//starts tbe new activity
    }

    public void onViewFormButton(View view) {
        //this code will start a new activity to view the form activity
        Intent intent = new Intent(this, FormActivity.class);
        startActivity(intent);//starts tbe new activity
    }

    public void onViewImageGrid(View view) {
        //this code will start a new activity to view the grid activity
        Intent intent = new Intent(this, ImageScaleActivity.class);
        startActivity(intent);//starts tbe new activity
    }


}