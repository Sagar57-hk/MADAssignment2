package com.project.madassignment2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Re_Task_detail#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Re_Task_detail extends Fragment {

TextView title,desc,priority,add_notes,date;
View view;

    public Re_Task_detail() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view =  inflater.inflate(R.layout.fragment_re__task_detail, container, false);
         return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();


    }

    public void init(){

        title = view.findViewById(R.id.titleTxt);
        desc = view.findViewById(R.id.descTxt);
        priority = view.findViewById(R.id.priTxt);
        date = view.findViewById(R.id.dateTxt);
        add_notes = view.findViewById(R.id.addTxt);
    }
}