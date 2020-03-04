package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RicoActivity extends AppCompatActivity {
    ImageView image;
    private Button previousButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rico);
        image = (ImageView) findViewById(R.id.image_view);
        image.setImageResource(R.drawable.rico);

        previousButton = (Button) findViewById(R.id.previousImageButton);
        previousButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivityPieski();
            }
        });
    }

    public void openActivityPieski(){
        Intent intent = new Intent(this, PieskiActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
