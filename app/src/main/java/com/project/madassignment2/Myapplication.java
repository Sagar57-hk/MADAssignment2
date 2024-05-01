package com.project.madassignment2;

import android.app.Application;

import java.util.ArrayList;

public class Myapplication extends Application {
    public static ArrayList<Task> tasks;

    @Override
    public void onCreate() {
        super.onCreate();
        tasks = new ArrayList<>();
        tasks.add(new Task("Ali Raza", "Wapda Town", "High", "20/12/2024"));
        tasks.add(new Task("Mahmood Hassan", "Link Road Model Town", "Low", "12/12/2024"));
        tasks.add(new Task("Jawad Ghauri", "Gujranwala", "High", "23/11/2024"));
    }
}
