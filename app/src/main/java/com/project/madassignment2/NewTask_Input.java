package com.project.madassignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class NewTask_Input extends AppCompatActivity {

    EditText title,date,desc,priority,add;
    EditText tn;
    private  static ArrayList<Task>tasks;

Button save;
    String s_title,s_desc,s_date,s_priority;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task_input);

        init();


save.setOnClickListener(v -> {
    Intent i = new Intent(NewTask_Input.this, Re_Task.class);
            s_title = tn.getText().toString();
    s_desc = desc.getText().toString();
    tasks = new ArrayList<>();
    Task task= new Task(s_title, s_desc);
    tasks.add(task);

    startActivity(i);
});
    }

    public void init(){
        save = findViewById(R.id.save);

        //title = findViewById(t_edit);
        tn =  findViewById(R.id.t_edit);
        date=  findViewById(R.id.date_edit);
        desc = findViewById(R.id.desc_edit);
        add = findViewById(R.id.addNote_edit);
        priority = findViewById(R.id.priority_edit);
    }
}