package com.example.application;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {

    private static final float BYTES_PER_PX = 4.0f;
    ImageView image;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.image_view);

        loadImage();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, OneActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);


    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    private void loadImage(){
        if(readBitmapInfo() > MemUtils.megabytesFree()){
            subSampleImage(32);
        } else {
            image.setImageResource(R.drawable.background1);
        }
    }

    private float readBitmapInfo(){
        final Resources res = this.getResources();
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, R.drawable.background1, options);
        final float imageHeight = options.outHeight;
        final float imageWidth = options.outWidth;
        final String imageMimeType = options.outMimeType;

        Log.d("ScaleBeforeLoad", "w, h, type: " + imageWidth + ", " + imageHeight + ", " + imageMimeType);
        Log.d("ScaleBeforeLoad", "estimated memory required in MB: " + imageWidth * imageHeight * BYTES_PER_PX / MemUtils.BYTES_IN_MB);
        return imageWidth * imageHeight * BYTES_PER_PX / MemUtils.BYTES_IN_MB;
    }

    private void subSampleImage(int powerOf2){
        if(powerOf2 < 1 || powerOf2 > 32){
            Log.e("ScaleBeforeLoad", "trying to apply upscale or excessive downscale: " + powerOf2);
            return;
        }

        final Resources res = this.getResources();
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = powerOf2;
        final Bitmap bmp = BitmapFactory.decodeResource(res, R.drawable.background1, options);
        image.setImageBitmap(bmp);
    }
}
