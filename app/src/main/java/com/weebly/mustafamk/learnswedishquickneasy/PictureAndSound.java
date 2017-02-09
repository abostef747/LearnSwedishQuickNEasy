package com.weebly.mustafamk.learnswedishquickneasy;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;


public class PictureAndSound extends AppCompatActivity {
    Bitmap car_bm;
    TextToSpeech ttsobject;
    int result;
    int position;
    public Integer theId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_row);

        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new CustomAdapter(this));

        ttsobject = new TextToSpeech(this, new TextToSpeech.OnInitListener() {

            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    result = ttsobject.setLanguage(Locale.US);
                } else {
                    Toast.makeText(getApplicationContext(), "Feature is not supported Supported in ur Device", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

            public void onClick(View v) {

            }


        //Hämta storlek på skärmen
     /*   DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        ImageView carImage = (ImageView) findViewById(R.id.car);
        ImageView cykelImage = (ImageView) findViewById(R.id.cykel);
        ImageView houseImage = (ImageView) findViewById(R.id.house);
        ImageView kvinnaImage = (ImageView)findViewById(R.id.kvinna);
        ImageView manImage = (ImageView)   findViewById(R.id.man);
        ImageView papperImage = (ImageView)findViewById(R.id.papper);
        ImageView pennaImage = (ImageView) findViewById(R.id.penna);
        ImageView treeImage = (ImageView)  findViewById(R.id.tree);
        ImageView godisImage = (ImageView)  findViewById(R.id.godis);
*/

      //  Bitmap optimizedcar    = com.weebly.mustafamk.learnswedishquickneasy.ResizeImage.getOptimizedBitmap(this, R.drawable.car   ,metrics.widthPixels , metrics.heightPixels);
  /*      Bitmap optimizedcykel  = ResizeImage.getOptimizedBitmap(PictureAndSound.this, R.id.cykel , 100 , 100);
        Bitmap optimizedhouse  = ResizeImage.getOptimizedBitmap(PictureAndSound.this, R.id.house , 100 , 100);
        Bitmap optimizedkvinna = ResizeImage.getOptimizedBitmap(PictureAndSound.this, R.id.kvinna, 100 , 100);
        Bitmap optimizedman    = ResizeImage.getOptimizedBitmap(PictureAndSound.this, R.id.man   , 100 , 100);
        Bitmap optimizedpapper = ResizeImage.getOptimizedBitmap(PictureAndSound.this, R.id.papper, 100 , 100);
        Bitmap optimizedpenna  = ResizeImage.getOptimizedBitmap(PictureAndSound.this, R.id.penna , 100 , 100);
        Bitmap optimizedtree   = ResizeImage.getOptimizedBitmap(PictureAndSound.this, R.id.tree  , 100 , 100);
        Bitmap optimizedgodis  = ResizeImage.getOptimizedBitmap(PictureAndSound.this, R.id.godis , 100 , 100);
*/

       // carImage.setImageBitmap(optimizedcar);
       /* cykelImage.setImageBitmap(optimizedcykel);
        houseImage.setImageBitmap(optimizedhouse);
        kvinnaImage.setImageBitmap(optimizedkvinna);
        manImage.setImageBitmap(optimizedman);
        papperImage.setImageBitmap(optimizedpapper);
        pennaImage.setImageBitmap(optimizedpenna);
        treeImage.setImageBitmap(optimizedtree);
        godisImage.setImageBitmap(optimizedgodis);
*/


    }

        /*

        DisplayMetrics metrics = new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        Bitmap optimizedImage = ResizeImage.getOptimizedBitmap(PictureAndSound.this,car_bm , metrics.widthPixels, metrics.heightPixels);

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), R.id.car   , options);
        BitmapFactory.decodeResource(getResources(), R.id.cykel , options);
        BitmapFactory.decodeResource(getResources(), R.id.house , options);
        BitmapFactory.decodeResource(getResources(), R.id.kvinna, options);
        BitmapFactory.decodeResource(getResources(), R.id.man   , options);
        BitmapFactory.decodeResource(getResources(), R.id.papper, options);
        BitmapFactory.decodeResource(getResources(), R.id.penna , options);
        BitmapFactory.decodeResource(getResources(), R.id.tree  , options);

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