package com.example.eric.academytutorialapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    public static final String USERNAME_KEY = "USERNAME";
    public static final String USERAGE_KEY = "USERAGE";
    public static final String USEREMAIL_KEY = "USEREMAIL";
    public static final String USERPHONE_KEY = "USERPHONE";

        private EditText mNameField2;
        private TextView mNameField;
        private EditText mAgeField2;
        private TextView mAgeField;
        private EditText mEmailField2;
        private TextView mEmailField;
        private EditText mPhoneField2;
        private TextView mPhoneField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mNameField = (TextView) findViewById(R.id.nameField);
        mNameField2 = (EditText) findViewById(R.id.name_hint);

        mAgeField = (TextView) findViewById(R.id.ageField);
        mAgeField2 = (EditText) findViewById(R.id.age_hint);

        mEmailField = (TextView) findViewById(R.id.emailField);
        mEmailField2 = (EditText) findViewById(R.id.email_hint);

        mPhoneField = (TextView) findViewById(R.id.phoneField);
        mPhoneField2 = (EditText) findViewById(R.id.phone_hint);

//        Typeface tf1 = Typeface.createFromAsset(getAssets(), "fonts/newfont.ttf");
//        mNameField.setTypeface(tf1);
//        mNameField2.setTypeface(tf1);
//        mAgeField.setTypeface(tf1);
//        mAgeField2.setTypeface(tf1);
//        mEmailField.setTypeface(tf1);
//        mEmailField2.setTypeface(tf1);
//        mPhoneField.setTypeface(tf1);
//        mPhoneField2.setTypeface(tf1);

    }

    public void onSubmitPressed(View view){

        String userName = mNameField2.getText().toString();
        String userAge = mAgeField2.getText().toString();
        String email = mEmailField2.getText().toString();
        String phoneNum = mPhoneField2.getText().toString();

        String output = "Hey " + userName + " your information is saved.";
        Toast.makeText(this, output, Toast.LENGTH_LONG).show();

        Bundle bundle = new Bundle();
        bundle.putString(USERNAME_KEY, userName);
        bundle.putString(USERAGE_KEY, userAge);
        bundle.putString(USEREMAIL_KEY, email);
        bundle.putString(USERPHONE_KEY, phoneNum);

        Intent intent = new Intent(this, DisplayInformation.class);
        intent.putExtras(bundle);

        startActivity(intent);
    }
}
