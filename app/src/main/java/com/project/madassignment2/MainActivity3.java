package com.project.madassignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    LinearLayout portrait, landscape;
    FragmentManager manager;
    Fragment ftask, fDetail;

    TextView tvDescription;

    ArrayList<String> phoneNumbers;
    View viewOfDetailFrag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    init();

        tvDescription =  viewOfDetailFrag.findViewById(R.id.tvDesc);

        phoneNumbers = new ArrayList<>();
        phoneNumbers.add("0323312");
        phoneNumbers.add("0868576");
        phoneNumbers.add("0912121");
        phoneNumbers.add("0585858");
        phoneNumbers.add("0232323");

        tvDescription.setText(phoneNumbers.get(0));
    }

    private void init()
    {
            portrait = findViewById(R.id.portrait_mode);
            //landscape = findViewById(R.id.landscape_mode);
            manager = getSupportFragmentManager();
            ftask = manager.findFragmentById(R.id.ftask);
            fDetail = manager.findFragmentById(R.id.fDetail);
            assert fDetail != null;
            viewOfDetailFrag = fDetail.requireView();
    }
}