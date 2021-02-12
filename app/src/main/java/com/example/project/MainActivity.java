package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    static final int READ_BLOCK_SIZE = 100;
    TextView high_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer music= MediaPlayer.create(MainActivity.this,R.raw.music1);
        music.start();


        //Lettura High-Score

        high_score = findViewById(R.id.high_score_text_view);

        try{
            FileInputStream fileIn = openFileInput("file_buffet.txt");
            InputStreamReader inputReader = new InputStreamReader(fileIn);

            char[] inputBuffer = new char[READ_BLOCK_SIZE];
            String s = "";
            int charRead;

            while ((charRead = inputReader.read(inputBuffer)) > 0) {
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                s += readstring;
            }
            inputReader.close();
            high_score.setText(s);
        } catch (Exception e) { e.printStackTrace(); }
    }

    public void instructions(View view){
        Intent intent = new Intent(this, Instructions.class);
        startActivity(intent);
    }

}