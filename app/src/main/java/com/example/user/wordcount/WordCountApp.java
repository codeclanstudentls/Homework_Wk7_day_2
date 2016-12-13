package com.example.user.wordcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 13/12/2016.
 */
public class WordCountApp extends AppCompatActivity {
    EditText enterTextToCount;
    Button pressButton;
    TextView displayCount;

    @Override
    protected void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterTextToCount = (EditText) findViewById(R.id.text_enter);
        pressButton = (Button) findViewById(R.id.count_words);
        displayCount = (TextView) findViewById(R.id.display_count);


        pressButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                String textInput = enterTextToCount.getText().toString();
                WordCounter wordcounter = new WordCounter();
                int wordnumber = wordcounter.count(textInput);
                displayCount.setText("There are " + wordnumber);


            }
        });
    };
}


