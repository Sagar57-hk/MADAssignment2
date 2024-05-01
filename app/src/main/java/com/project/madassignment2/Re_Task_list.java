package com.project.madassignment2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Re_Task_list#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Re_Task_list extends Fragment {

RecyclerView recyclerView;
TextView textView1,textView2;
  ;//new LinearLayoutManager(fragment_re_task_list);
RecyclerView.Adapter myAdapter;
View view;
ImageView back;

Spinner spinner;

    public static ArrayList<Task>tasks;

Button newBtn;



    public Re_Task_list() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_re__task_list, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        init();


        newBtn.setOnClickListener(v -> {

            Intent intent = new Intent(getContext(), NewTask_Input.class);
                    getContext().startActivity(intent);
        });



        String[] items = new String[]{"Priority","High", "Low"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, items);
//set the spinners adapter to the previously created one.
        spinner.setAdapter(adapter);
    }



    public void init()
    {


        tasks = new ArrayList<>();
        newBtn = view.findViewById(R.id.newBtn);
        back=view.findViewById(R.id.back);
        recyclerView = view.findViewById(R.id.list_recycle);
        recyclerView.setHasFixedSize(true);
        spinner = view.findViewById(R.id.spinner1);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
       Task task= new Task("Body", "Description","High","21/02/2024");
       tasks.add(task);
        myAdapter = new TaskAdapter(getContext(),tasks);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(layoutManager);
        myAdapter.notifyDataSetChanged();
       // recyclerView.setLayoutManager(manager);


    }
}