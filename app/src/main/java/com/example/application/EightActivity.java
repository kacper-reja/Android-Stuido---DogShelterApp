package com.example.application;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class EightActivity extends AppCompatActivity {

    AnimationDrawable animation;

    ImageView image;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        image = (ImageView) findViewById(R.id.image_view);
        image.setImageResource(R.drawable.loading);
        ImageView loading = (ImageView) findViewById(R.id.loading);
        final Handler handler = new Handler();
        animation = (AnimationDrawable) loading.getDrawable();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                animation.start();
            }
        }, 100);


        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                animation.stop();
                Intent intent = new Intent(EightActivity.this, PieskiActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5950);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
