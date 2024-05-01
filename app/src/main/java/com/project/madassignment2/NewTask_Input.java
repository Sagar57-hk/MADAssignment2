package com.project.madassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class NewTask_Input extends AppCompatActivity {

    EditText title,date,desc,priority,add;
    EditText tn;
ImageView img;
    String s_title,s_desc,s_date,s_priority;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task_input);

        init();

img.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(NewTask_Input.this, Re_Task.class);
        startActivity(intent);
    }
});
    }

    public void init(){
        img = findViewById(R.id.saveBtn);
        //title = findViewById(t_edit);
        tn =  findViewById(R.id.t_edit);
        date=  findViewById(R.id.date_edit);
        desc = findViewById(R.id.desc_edit);
        add = findViewById(R.id.addNote_edit);
        priority = findViewById(R.id.priority_edit);
    }
}