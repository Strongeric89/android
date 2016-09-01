package com.example.eric.taskapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Eric on 31/08/2016.
 */
public class AddNewTask extends AppCompatActivity{

    public static ArrayList<Task> taskList = new ArrayList<>();

    private EditText mTitleField;
    private EditText mDescField;
    private Spinner mUgencyField;

    @Override
   protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        //Identifing the Id's from the activity_form xml
        mTitleField = (EditText)findViewById(R.id.TaskNameField2);
        mDescField = (EditText) findViewById(R.id.TaskDesField2);
        mUgencyField = (Spinner) findViewById(R.id.TaskSpinner);


    }//end onCreate

    public void onSubmitPressed(View view){
        String title = mTitleField.getText().toString();
        String description = mDescField.getText().toString();
        String urgency = mUgencyField.getSelectedItem().toString();

        if(title.equals("") || description.equals("")){
            Toast.makeText(this, "Please input all information",Toast.LENGTH_LONG).show();

            return;
        }// end if

        int urgencyLevel = 0;
        switch(urgency){
            case "High" : urgencyLevel = 3;break;
            case "Medium" : urgencyLevel =2;break;
            case "Low": urgencyLevel = 1;break;
        }



        Task task = new Task(title, description,urgencyLevel);
        taskList.add(task);

        Toast.makeText(this,"New Task Added!",
        Toast.LENGTH_LONG).show();


        //clear the screen
        mTitleField.setText("");
        mDescField.setText("");
        mUgencyField.setSelection(0);

    }//end on submit pressed


}//end addNewTask
