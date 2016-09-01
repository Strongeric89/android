package com.example.eric.taskapp;

/**
 * Created by Eric on 31/08/2016.
 */
public class Task {

    private String title;
    private String description;
    private int urgencyLevel;

    public Task(String title, String description, int urgencyLevel){
        this.title = title;
        this.description = description;
        this.urgencyLevel = urgencyLevel;

    }//end task Constructor

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(int urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }


}
