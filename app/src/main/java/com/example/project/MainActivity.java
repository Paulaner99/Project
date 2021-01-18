package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer music= MediaPlayer.create(MainActivity.this,R.raw.music1);
        music.start();
    }

    public void instructions(View view){
        Intent intent = new Intent(this, Instructions.class);
        startActivity(intent);
    }
}