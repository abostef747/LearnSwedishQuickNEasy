package com.weebly.mustafamk.learnswedishquickneasy;

import java.util.Random;

/**
 * Created by bhkfghhdf on 2016-04-18.
 */
public class MyRandom {
    public static int randomize(int min, int max) {
        Random random = new Random();

        // Vad göra om max < min ?
        // Ex: min = 20 och max = 10
        // Byt plats på värdena! Gör något så att max blir 20 och min blir 10

        int temp;

        if(max < min) {
            temp = min; // min är det större talet, så tmp blir det större talet
            min = max;  // min ersätts nu med vad max var (max var det mindre talet)
            max = temp;
        }

        int result = random.nextInt(max - min + 1 ) + min;

        return result;
    }
    //ok
}
