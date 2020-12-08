package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Choice2000 extends AppCompatActivity {

    private TextView cash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice2000);

        cash = (TextView) findViewById(R.id.cash_value_text_view)
    }


    public void onRadioButtonClicked1(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group1);
        int id = radioGroup.getCheckedRadioButtonId();
        switch(id) {
            case R.id.radio_1_1:
                // 25%

                break;
            case R.id.radio_1_2:
                // 50%
                break;
            case R.id.radio_1_3:
                // 75%
                break;
            case R.id.radio_1_4:
                // 100%
                break;
        }
    }
dioverme della madonna boia
}