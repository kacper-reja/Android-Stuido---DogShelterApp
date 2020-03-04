package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FiveActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    private Button previousButton, nextButton;
    ImageView image;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        image = (ImageView) findViewById(R.id.image_view);
        image.setImageResource(R.drawable.background6);

        radioGroup = findViewById(R.id.radioGroup);

        previousButton = (Button) findViewById(R.id.previousImageButton);
        previousButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        nextButton = (Button) findViewById(R.id.nextImageButton);
        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });

    }

    public void checkButton(View v)
    {
        int radid = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(radid);
    }

    public void openActivity4(){
        Intent intent = new Intent(this, FourActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void openActivity6(){
        Intent intent = new Intent(this, SixActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}

