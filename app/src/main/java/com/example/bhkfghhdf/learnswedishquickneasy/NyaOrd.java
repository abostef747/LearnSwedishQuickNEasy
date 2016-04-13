package com.example.bhkfghhdf.learnswedishquickneasy;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by bhkfghhdf on 2016-04-11.
 */
public class NyaOrd extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nya_ord);
        Button playSwe = (Button)findViewById(R.id.button_play_swe);
        Button playEng = (Button)findViewById(R.id.button_play_Eng);

        final MediaPlayer mpSvenska = MediaPlayer.create(NyaOrd.this,R.raw.svenskaord);
        final MediaPlayer mpEngelska = MediaPlayer.create(NyaOrd.this,R.raw.englishword);

        playSwe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpSvenska.start();
            }
        });

        playEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpEngelska.start();
            }
        });



    }
}
