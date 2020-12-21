package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Choise2010 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choise2010);

        Intent intent = getIntent();

        String cash2010 = intent.getStringExtra(Choice2000.EXTRA_MESSAGE);

        TextView textview = findViewById(R.id.cash_value_2010);
        textview.setText(cash2010);
    }

    public void choice2015(View view) {
        Intent intent = new Intent(this, Choise2015.class);
        startActivity(intent);
    }
}