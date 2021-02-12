package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Risultato extends AppCompatActivity {

    static final int READ_BLOCK_SIZE = 100;

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


        //Salvataggio High-Score
        String s = "";

        try{
            FileInputStream fileIn = openFileInput("file_buffet.txt");
            InputStreamReader inputReader = new InputStreamReader(fileIn);

            char[] inputBuffer = new char[READ_BLOCK_SIZE];
            int charRead;

            while ((charRead = inputReader.read(inputBuffer)) > 0) {
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                s += readstring;
            }
            inputReader.close();
        } catch (Exception e) { e.printStackTrace(); }

        if( Float.parseFloat(text_cash.getText().toString()) > Float.parseFloat(s)) {

            try {
                FileOutputStream fileout = openFileOutput("file_buffet.txt", MODE_PRIVATE);
                OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
                outputWriter.write(text_cash.getText().toString());
                outputWriter.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void Home(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}