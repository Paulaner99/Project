package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Risultato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_risultato);

        Intent intent = getIntent();

        String finalScore = intent.getStringExtra(Choise2015.EXTRA_MESSAGE);

        TextView text_cash = findViewById(R.id.cash_value_finale);
        text_cash.setText(finalScore);

        TextView final_result = findViewById(R.id.score);

        if( Float.parseFloat(text_cash.getText().toString()) > 3800000){
            final_result.setText(R.string.win);
        } else { final_result.setText(R.string.lose); }
    }

    public void Home(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}