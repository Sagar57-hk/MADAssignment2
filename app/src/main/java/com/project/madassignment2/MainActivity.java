package com.project.madassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView2;
    SharedPreferences sharedPreferences;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView;
        imageView=findViewById(R.id.logo);

        sharedPreferences = getSharedPreferences("TaskM",MODE_PRIVATE);
        Animation logo_animation = AnimationUtils.loadAnimation(this, R.anim.logo_anim);
        imageView.setAnimation(logo_animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if(sharedPreferences.getBoolean("isLogin",false))
                {
                    Intent intent = new Intent(MainActivity.this, Home.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, Re_Task.class);
                    startActivity(intent);
                    finish();
                }
            }
        },2000);
    }

}