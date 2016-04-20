package com.example.bhkfghhdf.learnswedishquickneasy;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void NyaOrdVyn(View view){
        Intent i = new Intent(MainActivity.this, NyaOrd.class);
        startActivity(i);
    }

    public void GrammarVyn(View view){
        Intent i = new Intent(MainActivity.this, Grammatik.class);
        startActivity(i);
    }


    public void ImageAndSound(View view){
        Intent j = new Intent(MainActivity.this, PictureAndSound.class);
        startActivity(j);
    }

    public void SettingsView(View view){
        Intent j = new Intent(MainActivity.this, MySettings.class);
        startActivity(j);
    }
}