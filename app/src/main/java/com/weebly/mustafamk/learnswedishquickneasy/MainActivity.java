package com.weebly.mustafamk.learnswedishquickneasy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }




    /*
    Here after is the Activities
     */

    public void NyaOrdVyn(View view){
        Intent i = new Intent(MainActivity.this, com.weebly.mustafamk.learnswedishquickneasy.NyaOrd.class);
        startActivity(i);
    }

    public void GrammarVyn(View view){
        Intent i = new Intent(MainActivity.this, Grammatik.class);
        startActivity(i);
    }


    public void ImageAndSound(View view){
        Intent j = new Intent(MainActivity.this, com.weebly.mustafamk.learnswedishquickneasy.PictureAndSound.class);
        startActivity(j);
    }

    public void SettingsView(View view){
        Intent j = new Intent(MainActivity.this, com.weebly.mustafamk.learnswedishquickneasy.MySettings.class);
        startActivity(j);
    }
}