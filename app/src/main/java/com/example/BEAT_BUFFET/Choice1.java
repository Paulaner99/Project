package com.example.BEAT_BUFFET;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Choice1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice1);
    }

    public void choice1(View view){
        Intent intent = new Intent(this, Choice1.class);
        startActivity(intent);
    }
}