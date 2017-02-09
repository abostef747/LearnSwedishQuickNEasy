package com.weebly.mustafamk.learnswedishquickneasy;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class NyaOrd extends AppCompatActivity {
    TextToSpeech ttsobject;
    int result;
    String text;
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

        final TextView engWord = (TextView) findViewById(R.id.actual_english_word);
        final TextView sweWord = (TextView) findViewById(R.id.actual_swedish_word);
        TextView engPhrase = (TextView) findViewById(R.id.actual_english_description);

        ttsobject = new TextToSpeech(this, new TextToSpeech.OnInitListener() {

            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    result = ttsobject.setLanguage(Locale.US);
                } else {
                    Toast.makeText(getApplicationContext(), "Feature is not supported Supported in ur Device", Toast.LENGTH_SHORT).show();
                }
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton playSwe = (ImageButton) findViewById(R.id.button_play_swe);
        ImageButton playEng = (ImageButton) findViewById(R.id.button_play_Eng);

        playSwe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button_play_swe:

                        if (result == TextToSpeech.LANG_NOT_SUPPORTED || result == TextToSpeech.LANG_MISSING_DATA) {
                            Toast.makeText(getApplicationContext(), "Feature is not supported Supported in ur Device", Toast.LENGTH_SHORT).show();
                        } else {
                            text = sweWord.getText().toString();
                            ttsobject.speak(text, TextToSpeech.QUEUE_FLUSH, null);
                        }
                        break;
                }
            }
        });

        playEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button_play_Eng:
                        if (result == TextToSpeech.LANG_NOT_SUPPORTED || result == TextToSpeech.LANG_MISSING_DATA) {
                            Toast.makeText(getApplicationContext(), "Feature is not supported Supported in ur Device", Toast.LENGTH_SHORT).show();
                        } else {
                            text = engWord.getText().toString();
                            ttsobject.speak(text, TextToSpeech.QUEUE_FLUSH, null);
                        }
                        break;
                }
            }
        });
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
