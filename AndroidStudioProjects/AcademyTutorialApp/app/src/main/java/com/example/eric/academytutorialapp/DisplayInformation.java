package com.example.eric.academytutorialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_information);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String userName = bundle.getString(FormActivity.USERNAME_KEY);
        String userAge = bundle.getString(FormActivity.USERAGE_KEY);
        String userEmail = bundle.getString(FormActivity.USEREMAIL_KEY);
        String userPhone = bundle.getString(FormActivity.USERPHONE_KEY);


        TextView displayName = (TextView) findViewById(R.id.nameDisplay);
        displayName.setText(userName);

        TextView displayAge = (TextView) findViewById(R.id.ageDisplay);
        displayAge.setText(userAge);

        TextView displayEmail = (TextView) findViewById(R.id.emailDisplay);
        displayEmail.setText(userEmail);

        TextView displayPhone = (TextView) findViewById(R.id.phoneDisplay);
        displayPhone.setText(userPhone);
    }
}
