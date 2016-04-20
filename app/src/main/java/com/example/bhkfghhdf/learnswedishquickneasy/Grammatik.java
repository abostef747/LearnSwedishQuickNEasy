package com.example.bhkfghhdf.learnswedishquickneasy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by bhkfghhdf on 2016-04-19.
 */
public class Grammatik extends AppCompatActivity {
    ArrayList<String> grammarPhrases;
    ArrayList<String> grammarAnswers;
    TextView phraseTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grammatik);

        grammarPhrases = new ArrayList<>();
        grammarAnswers = new ArrayList<>();

        //Frågor
        grammarPhrases.add("1. Telefonen Ringer! ______ du? (svara)");
        grammarPhrases.add("2. Vem är det Lisa ______ med? (tala) ");
        grammarPhrases.add("3. Vad ______ du? (läsa)");
        //svaren
        grammarAnswers.add("svarar");
        grammarAnswers.add("talar");
        grammarAnswers.add("läser");




        phraseTextView = (TextView)findViewById(R.id.grammatikPhrase);
        phraseTextView.setText(grammarPhrases.get(0));
        //ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<String>(this, R.layout.grammatik, grammarPhrases);

    }

    int count = 0;
    public void Answered(View view){
        Button answerClicked = (Button)findViewById(R.id.answer_a);

        while(count < grammarPhrases.size()) {
            String answeredQuestion = phraseTextView.getText().toString();

            if (answeredQuestion == grammarAnswers.get(count)) {
                Toast.makeText(this, "Correct answer is " + grammarAnswers.get(count), Toast.LENGTH_LONG).show();
                count++;
            }
        }

    }
    int countAnswers = 0;
    int countQuestion = 0;
    int countStage = 0;
    public void NextQuestion(View view){
        String[]firstAnswers = {"svarar", "svarade", "svarad", "svar"};
        String[]secondAnswers = {"tal", "talade", "talar", "talad"};
        String[]thirdAnswers = {"läsade", "läste", "läser", "läst"};

        Button buttonA = (Button)findViewById(R.id.answer_a);
        Button buttonB = (Button)findViewById(R.id.answer_b);
        Button buttonC = (Button)findViewById(R.id.answer_c);
        Button buttonD = (Button)findViewById(R.id.answer_d);

        switch (countStage){
            case 0:
                buttonA.setText(firstAnswers[countAnswers]);
                buttonB.setText(firstAnswers[countAnswers+1]);
                buttonC.setText(firstAnswers[countAnswers+2]);
                buttonD.setText(firstAnswers[countAnswers+3]);
                break;
            case 1:
                buttonA.setText(secondAnswers[countAnswers]);
                buttonB.setText(secondAnswers[countAnswers+1]);
                buttonC.setText(secondAnswers[countAnswers+2]);
                buttonD.setText(secondAnswers[countAnswers+3]);
                break;
            case 2:
                buttonA.setText(thirdAnswers[countAnswers]);
                buttonB.setText(thirdAnswers[countAnswers+1]);
                buttonC.setText(thirdAnswers[countAnswers+2]);
                buttonD.setText(thirdAnswers[countAnswers+3]);
                break;
                default:
                    Toast.makeText(this, "Fail to Switch Case", Toast.LENGTH_SHORT).show();
        }

        if (countAnswers >= grammarPhrases.size()){
            countAnswers = 0;
        }else{
            countAnswers++;
        }

        phraseTextView = (TextView)findViewById(R.id.grammatikPhrase);
        phraseTextView.setText(grammarPhrases.get(countQuestion));

        if(countQuestion >= grammarPhrases.size()) {
            countQuestion = 0;
        }else{
            countQuestion++;
        }
        countStage++;
    }
}
