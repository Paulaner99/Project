package com.example.BEAT_BUFFET;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import static com.example.BEAT_BUFFET.MainActivity.msec;
import static com.example.BEAT_BUFFET.MainActivity.music;

public class Instructions extends AppCompatActivity {

    private boolean change_act = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
    }

    public void choice2000(View view) {
        Intent intent = new Intent(this, Choice2000.class);
        change_act = true;
        startActivity(intent);
    }

    @Override
    protected void onPause(){
        super.onPause();
        if(change_act == false){
            msec = music.getCurrentPosition();
            music.stop();
        }
    }

    protected void onRestart(){
        super.onRestart();
        try {
            music.prepare();
        } catch (Exception e){ e.printStackTrace(); }
        music.seekTo(msec);
        music.start();
        change_act = false;
    }
}