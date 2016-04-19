package com.example.bhkfghhdf.learnswedishquickneasy;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NyaOrd extends AppCompatActivity {

    String[] sweWords = {"Snygg", "Jakt", "Matsal"};
    String[] swePhrases = {"Som man tycker om att se på, ren, ordentlig, bra, passande",
            "När man försöker döda djur som man t.ex. ska äta, följa efter någon för att fånga eller få tag i honom/henne, en stor lyxig båt",
            "Stort rum där många äter mat t.ex. i en skola"};

    String[]engWords = {"Handsome", "Hunt", "dining room"};
    String[]engPhrases = {"Someone that you like to see, clean, proper, good, suitable",
            "When you try to kill an animal så that you could for example eat, follow someone to try catch him or get in touch with, a big luxury luxury båt",
            "Big room where many people eat food that you could order for example in a school"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nya_ord);

    }

    // Instansmetoder
    public void changeTranslation(View v) {
        // Hämta vår TextView (den med id factTextView)
        TextView sweWordTV = (TextView) findViewById(R.id.actual_swedish_word);
        TextView swePhraseTV = (TextView) findViewById(R.id.actual_swedish_description);
        TextView engWordTV = (TextView) findViewById(R.id.actual_english_word);
        TextView engPhraseTV = (TextView) findViewById(R.id.actual_english_description);

        MyRandom myRandom = new MyRandom();
        int randomNumber = myRandom.randomize(0, sweWords.length - 1);

        sweWordTV.setText(sweWords[randomNumber]);
        swePhraseTV.setText(swePhrases[randomNumber]);
        engWordTV.setText(engWords[randomNumber]);
        engPhraseTV.setText(engPhrases[randomNumber]);
    }
}

        /*
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


        */
