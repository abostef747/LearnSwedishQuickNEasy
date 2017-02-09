package com.weebly.mustafamk.learnswedishquickneasy;

import android.content.Context;

import com.weebly.mustafamk.learnswedishquickneasy.MyRandom;


public class WordsAndPhrases {
//grym
    // Instansvariabler
    Context context;

    String[] sweWords = {"Snygg", "Jakt", "Matsal"};
    String[] swePhrases = {"Som man tycker om att se på, ren, ordentlig, bra, passande",
            "När man försöker döda djur som man t.ex. ska äta, följa efter någon för att fånga eller få tag i honom/henne, en stor lyxig båt",
            "Stort rum där många äter mat t.ex. i en skola"};

    String[]engWords = {"Handsome", "Hunt", "dining room"};
    String[]engPhrases = {"Someone that you like to see, clean, proper, good, suitable",
            "When you try to kill an animal så that you could for example eat, follow someone to try catch him or get in touch with, a big luxury luxury båt",
            "Big room where many people eat food that you could order for example in a school"};
    // Klassvariabler
    public int randomNumber = MyRandom.randomize(0, sweWords.length - 1);

    public int randomSweWrdNr = randomNumber;
    public int randomSwePhrNr = randomNumber;
    public int randomEngWrdNr = randomNumber;
    public int randomEngPhrNr = randomNumber;


    public String getEngPhrases() {
        switch (randomEngPhrNr) {
            case 1: return engPhrases[0];

            case 2: return engPhrases[1];

            case 3: return engPhrases[2];

            default: return "Sorry try again!";
        }
    }

    public String getEngWords() {
        switch (randomEngWrdNr) {
            case 1: return engWords[0];

            case 2: return engWords[1];

            case 3: return engWords[2];

            default: return "Sorry try again!";
        }
    }

    public String getSwePhrases() {
        switch (randomSwePhrNr) {
            case 1: return swePhrases[0];

            case 2: return swePhrases[1];

            case 3: return swePhrases[2];

            default: return "Sorry try again!";
        }
    }

    public String getSweWords() {
        switch (randomSweWrdNr) {
            case 1: return sweWords[0];

            case 2: return sweWords[1];

            case 3: return sweWords[2];

            default: return "Sorry try again!";
        }
    }
}
