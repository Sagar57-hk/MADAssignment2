package com.project.madassignment2;

import static com.project.madassignment2.Myapplication.tasks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Re_Task extends AppCompatActivity implements MyClickListner {
    LinearLayout portrait, landscape;
    FragmentManager manager;
    Fragment flist, fdetail;
    View viewOfDetailFrag;
   ConstraintLayout layout_list;
   TextView titleTxt, dateTxt, descTxt, priTxt, addTxt;

    String title,desc;

    Task task;


    RecyclerView recyclerView;
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_task);

        manager = getSupportFragmentManager();
        init();

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            title = extras.getString("title");
            desc = extras.getString("Description");
        }


        if(portrait != null)
        {
           manager.beginTransaction().show(flist).hide(fdetail).commit();
        }
        else
        {
            manager.beginTransaction().show(flist).show(fdetail).commit();
        }

//        layout_list.setOnClickListener(v -> {
//
//
//        });
       // newData();

        TaskAdapter taskAdapter=new TaskAdapter(this,tasks);
        taskAdapter.onMyClickListener(this);


    }


    private void init()
    {

        flist = manager.findFragmentById(R.id.re_list);
        fdetail = manager.findFragmentById(R.id.re_detail);
        assert fdetail != null;
        viewOfDetailFrag = fdetail.requireView();
        portrait = findViewById(R.id.potrai_mode);
        landscape = findViewById(R.id.landscap_mode);
        titleTxt=findViewById(R.id.detail_title);
        dateTxt=findViewById(R.id.detail_dateTxt);
        descTxt=findViewById(R.id.detail_descTxt);
        priTxt=findViewById(R.id.detail_priTxt);
        addTxt=findViewById(R.id.detail_addTxt);

       // recyclerView = view.findViewById(R.id.list_recycle);
        layout_list=findViewById(R.id.layout_list);



    }

    public void newData()
    {
TaskAdapter myAdapter;
        ArrayList<Task> tasks = new ArrayList<>();
        Task task= new Task("title.toString()","desc.toString()");
        tasks.add(task);
        myAdapter = new TaskAdapter(Re_Task.this,tasks);
        recyclerView.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();

    }

    @Override
    public void myClick(View v, int position) {

        task = Re_Task_list.tasks.get(position);
        titleTxt.setText(task.getTask_title());
        descTxt.setText(task.getTask_description());
        dateTxt.setText(task.getTask_due_date());
        priTxt.setText(task.getTask_priority());



        if(portrait != null)
        {
            manager.beginTransaction()
                    .hide(flist)
                    .show(fdetail)
                    .addToBackStack(null)
                    .commit();
        }
    }
}