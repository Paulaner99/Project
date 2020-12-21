package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Choise2015 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choise2015);

        Intent intent = getIntent();

        String cash2015 = intent.getStringExtra(Choise2010.EXTRA_MESSAGE);

        TextView text_cash = findViewById(R.id.cash_value_2015);
        text_cash.setText(cash2015);
    }

}