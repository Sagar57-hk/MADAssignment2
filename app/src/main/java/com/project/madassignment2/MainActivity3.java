package com.project.madassignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity implements List_Task.ItemSelected {

    LinearLayout portrait, landscape;
    FragmentManager manager;
    Fragment ftask, fDetail;

    TextView tvDescription;

    String[] phoneNumbers;
    View viewOfDetailFrag;

    ArrayList<String> task = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    init();

        tvDescription =  viewOfDetailFrag.findViewById(R.id.tvDesc);

        phoneNumbers = getResources().getStringArray(R.array.descriptions);

        tvDescription.setText(phoneNumbers[0]);


        if(portrait != null)
        {
            manager.beginTransaction()
                    .show(ftask)
                    .hide(fDetail)
                    .commit();
        }
        else
        {
            manager.beginTransaction()
                    .show(ftask)
                    .show(fDetail)
                    .commit();
        }
    }

    private void init()
    {
            portrait = findViewById(R.id.portrait_mode);
            landscape = findViewById(R.id.landscape_mode);
            manager = getSupportFragmentManager();
            ftask = manager.findFragmentById(R.id.ftask);
            fDetail = manager.findFragmentById(R.id.fDetail);
            assert fDetail != null;
            viewOfDetailFrag = fDetail.requireView();
    }


    @Override
    public void onItemClicked(int index) {
        tvDescription.setText(phoneNumbers[index]);

        if(portrait != null)
        {
            manager.beginTransaction()
                    .hide(ftask)
                    .show(fDetail)
                    .addToBackStack(null)
                    .commit();
        }
    }
}