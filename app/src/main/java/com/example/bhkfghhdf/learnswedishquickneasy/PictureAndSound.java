package com.example.bhkfghhdf.learnswedishquickneasy;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.ImageView;

/**
 * Created by bhkfghhdf on 2016-04-12.
 */
public class PictureAndSound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bild_o_ljud);


    }
}

        /*

        DisplayMetrics metrics = new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        Bitmap optimizedImage = ResizeImage.getOptimizedBitmap(PictureAndSound.this,car_bm , metrics.widthPixels, metrics.heightPixels);

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), R.id.car, options);
        BitmapFactory.decodeResource(getResources(), R.id.cykel, options);
        BitmapFactory.decodeResource(getResources(), R.id.house, options);
        BitmapFactory.decodeResource(getResources(), R.id.kvinna, options);
        BitmapFactory.decodeResource(getResources(), R.id.man, options);
        BitmapFactory.decodeResource(getResources(), R.id.papper, options);
        BitmapFactory.decodeResource(getResources(), R.id.penna, options);
        BitmapFactory.decodeResource(getResources(), R.id.tree, options);

        int imageHeight = options.outHeight;
        int imageWidth = options.outWidth;
        String imageType = options.outMimeType;

        ImageView carImage = (ImageView) findViewById(R.id.car);
        ImageView cykelImage = (ImageView) findViewById(R.id.cykel);
        ImageView houseImage = (ImageView) findViewById(R.id.house);
        ImageView kvinnaImage = (ImageView)findViewById(R.id.kvinna);
        ImageView manImage = (ImageView)   findViewById(R.id.man);
        ImageView papperImage = (ImageView)findViewById(R.id.papper);
        ImageView pennaImage = (ImageView) findViewById(R.id.penna);
        ImageView treeImage = (ImageView)  findViewById(R.id.tree);

        car_bm = BitmapFactory.decodeResource(getResources(),R.drawable.car);
        car_bm = BitmapFactory.decodeResource(getResources(),R.drawable.cykel);
        car_bm = BitmapFactory.decodeResource(getResources(),R.drawable.house);
        car_bm = BitmapFactory.decodeResource(getResources(),R.drawable.kvinna);
        car_bm = BitmapFactory.decodeResource(getResources(),R.drawable.man);
        car_bm = BitmapFactory.decodeResource(getResources(),R.drawable.papper);
        car_bm = BitmapFactory.decodeResource(getResources(),R.drawable.penna);
        car_bm = BitmapFactory.decodeResource(getResources(),R.drawable.tree);

        carImage.setImageBitmap(car_bm);
        cykelImage.setImageBitmap(cykel_bm);
        houseImage.setImageBitmap(house_bm);
        kvinnaImage.setImageBitmap(kvinna_bm);
        manImage.setImageBitmap(man_bm);
        papperImage.setImageBitmap(papper_bm);
        pennaImage.setImageBitmap(penna_bm);
        treeImage.setImageBitmap(tree_bm);

        */