package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class PieskiActivity extends AppCompatActivity implements View.OnClickListener{

    ScaleImageView image;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pieski);

        image = (ScaleImageView) findViewById(R.id.image_view);
        image.setImageResource(R.drawable.pieski);

        Button button1 = findViewById(R.id.wedel);
        Button button2 = findViewById(R.id.jaskier);
        Button button3 = findViewById(R.id.pumba);
        Button button4 = findViewById(R.id.gucio);
        Button button5 = findViewById(R.id.geralt);
        Button button6 = findViewById(R.id.nygus);
        Button button7 = findViewById(R.id.koki);
        Button button8 = findViewById(R.id.babo);
        Button button9 = findViewById(R.id.missy);
        Button button10 = findViewById(R.id.frida);
        Button button11 = findViewById(R.id.bruno);
        Button button12 = findViewById(R.id.batman);
        Button button13 = findViewById(R.id.rico);
        Button button14 = findViewById(R.id.mis);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);

    }
    Intent intent;
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.wedel:
                intent = new Intent(this, WedelActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.jaskier:
                intent = new Intent(this, JaskierActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.pumba:
                intent = new Intent(this, PumbaActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.gucio:
                intent = new Intent(this, GucioActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.geralt:
                intent = new Intent(this, GeraltActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.nygus:
                intent = new Intent(this, NygusActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.koki:
                intent = new Intent(this, KokiActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.babo:
                intent = new Intent(this, BaboActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.missy:
                intent = new Intent(this, MissyActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.frida:
                intent = new Intent(this, FridaActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.bruno:
                intent = new Intent(this, BrunoActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.batman:
                intent = new Intent(this, BatmanActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.rico:
                intent = new Intent(this, RicoActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.mis:
                intent = new Intent(this, MisActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;

        }
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
