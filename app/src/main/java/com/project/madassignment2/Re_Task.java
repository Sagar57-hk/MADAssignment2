package com.project.madassignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Re_Task extends AppCompatActivity {
    LinearLayout portrait, landscape;
    FragmentManager manager;
    Fragment flist, fdetail;
    View viewOfDetailFrag;
   ConstraintLayout layout_list;

    TextView title,desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_task);
        manager = getSupportFragmentManager();
        init();



        if(portrait != null)
        {
           manager.beginTransaction().show(flist).hide(fdetail).commit();
        }
        else
        {

        }

//        layout_list.setOnClickListener(v -> {
//
//
//        });

    }
    private void init()
    {

        flist = manager.findFragmentById(R.id.re_list);
        fdetail = manager.findFragmentById(R.id.re_detail);
        assert fdetail != null;
        viewOfDetailFrag = fdetail.requireView();
        portrait = findViewById(R.id.potrai_mode);
        landscape = findViewById(R.id.landscap_mode);
        layout_list=findViewById(R.id.layout_list);

    }
}