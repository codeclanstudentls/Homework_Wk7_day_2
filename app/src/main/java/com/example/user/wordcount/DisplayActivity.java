package com.example.user.wordcount;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 13/12/2016.
 */
public class DisplayActivity extends AppCompatActivity {
    TextView displayCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        displayCount = (TextView) findViewById(R.id.display_count);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("answer");
        displayCount.setText(answer);
    }
}
