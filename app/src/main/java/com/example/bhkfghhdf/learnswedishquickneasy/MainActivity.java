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

    public void ImageAndSound(View view){
        Intent j = new Intent(MainActivity.this, PictureAndSound.class);
        startActivity(j);
    }

    public void SettingsView(View view){
        Intent j = new Intent(MainActivity.this, MySettings.class);
        startActivity(j);
    }




}


 /*ImageView cykelImage = (ImageView) findViewById(R.id.cykel);
        ImageView houseImage = (ImageView) findViewById(R.id.house);
        ImageView kvinnaImage = (ImageView)findViewById(R.id.kvinna);
        ImageView manImage = (ImageView)   findViewById(R.id.man);
        ImageView papperImage = (ImageView)findViewById(R.id.papper);
        ImageView pennaImage = (ImageView) findViewById(R.id.penna);
        ImageView treeImage = (ImageView)  findViewById(R.id.tree);


        //car_bm = BitmapFactory.decodeResource(getResources(),R.drawable.car);
        //car_bm = BitmapFactory.decodeResource(getResources(),R.drawable.car);
        //car_bm = BitmapFactory.decodeResource(getResources(),R.drawable.car);
        //car_bm = BitmapFactory.decodeResource(getResources(),R.drawable.car);
        //car_bm = BitmapFactory.decodeResource(getResources(),R.drawable.car);
        //car_bm = BitmapFactory.decodeResource(getResources(),R.drawable.car);
        //car_bm = BitmapFactory.decodeResource(getResources(),R.drawable.car);
        //Bitmap optimizedLogo = ResizeImage.getOptimizedBitmap(MainActivity.this,R.layout.bild_o_ljud, metrics.widthPixels, metrics.heightPixels);
*/