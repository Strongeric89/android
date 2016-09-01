/*
* The following App is a simple traffic light app. to use functionality of
* listeners and make use of drawable folderd
*
* */
package com.example.eric.trafficlights;

import android.content.DialogInterface;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView redLight;
    private ImageView yellowLight;
    private ImageView greenLight;

    private Button redButton;
    private Button yellowButton;
    private Button greenButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //onCreate the activity_main xml is displayed

        //the following gets the reference to the ids of the images
        redLight = (ImageView)findViewById(R.id.redLight);
        yellowLight = (ImageView)findViewById(R.id.yellowLight);
        greenLight = (ImageView)findViewById(R.id.greenLight);

        //now the buttons
        redButton = (Button)findViewById(R.id.redButton);
        greenButton = (Button)findViewById(R.id.greenButton);
        yellowButton = (Button)findViewById(R.id.yellowButton);

        //IF YOU CLICK ON THE BUTTON LISTENER
        redButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);

        //IF YOU CLICK ON THE LIGHT ITSELF LISTENER
        redLight.setOnClickListener(this);
        yellowLight.setOnClickListener(this);
        greenLight.setOnClickListener(this);

    }//end onCreate

    //The following code is a listener if red button do .....
    @Override
    public void onClick(View view) {
        if(view == redButton || view == redLight){
            turnOnRedLight(); //turn on red
            //turn off everything else
            turnOffGreenLight();
            turnOffYellowLight();
        }
        else if(view == yellowButton || view == yellowLight){
            turnOnYellowLight();

            turnOffGreenLight();
            turnOffRedLight();
        }
        else if(view == greenButton || view == greenLight){
            turnOnGreenLight();

            turnOffRedLight();
            turnOffYellowLight();
        }
    }

    private void turnOffYellowLight() {
        yellowLight.setImageResource(R.drawable.light_off);
    }

    private void turnOffRedLight() {
        redLight.setImageResource(R.drawable.light_off);
    }

    private void turnOffGreenLight() {
        greenLight.setImageResource(R.drawable.light_off);
    }

    private void turnOnGreenLight() {
        greenLight.setImageResource(R.drawable.green_on);
    }

    private void turnOnYellowLight() {
        yellowLight.setImageResource(R.drawable.yellow_on);
    }

    private void turnOnRedLight() {
        redLight.setImageResource(R.drawable.red_on);
    }
}//end mainActivity
