package com.project.madassignment2;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link List_Task#newInstance} factory method to
 * create an instance of this fragment.
 */
public class List_Task extends ListFragment {

    public interface ItemSelected
    {
        void onItemClicked(int index);
    }

    ItemSelected myActivity;
    public List_Task() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        myActivity = (ItemSelected) context;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Task task1 = null;
//        if (Myapplication.tasks != null) {
//            ArrayList<String> new_tasks = new ArrayList<>();
//            for (Task task : Myapplication.tasks) {
//                new_tasks.add(task.getTask_title());
//            }
//
//            ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_dropdown_item_1line, new_tasks);
//            setListAdapter(adapter);
//        } else {
////            String[] names = getResources().getStringArray(R.array.pieces);
//            String[] names;
//            names = new String[6];
//
//            for(int i=0;i<3;i++)
//            {
//                names[i]=task1.getTask_title();
//            }

        String[] names = getResources().getStringArray(R.array.pieces);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_dropdown_item_1line, names);
            setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        myActivity.onItemClicked(position);
    }
//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//
//    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(android.R.layout.simple_list_item_1, container, false);
    }



}