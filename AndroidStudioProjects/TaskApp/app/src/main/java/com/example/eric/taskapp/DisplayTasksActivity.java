package com.example.eric.taskapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DisplayTasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_tasks);

        //creating the link to xml
        ListView taskListView =(ListView) findViewById(R.id.task_list);

        String [] taskTitles = new String[AddNewTask.taskList.size()];  //goes to the addnewTask,java and gets the size of the array list

        //populate the array
        for(int i=0;i<taskTitles.length;i++){
            taskTitles[i]=AddNewTask.taskList.get(i).getTitle(); //getting the title part from the list of index i

        }//end for

        //setting up arrayAdapter whichi handles the contents of the ListView
        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, taskTitles);

        taskListView.setAdapter(adapter);

        //Implementing the listener for pressing on a long click on an item
        taskListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int i, long l) {
                AddNewTask.taskList.remove(i);
                recreate();
                return false;
            }
        });


    }//end onCreate
}//end DisplayTasksActivity
