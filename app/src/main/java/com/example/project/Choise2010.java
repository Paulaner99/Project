package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Choise2010 extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.project.MESSAGE";
    RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4;
    double guadagno;
    double cash;
    double value_cash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choise2010);

        Intent intent = getIntent();

        String cash2010 = intent.getStringExtra(Choice2000.EXTRA_MESSAGE);

        TextView text_cash = findViewById(R.id.cash_value_2010);
        text_cash.setText(cash2010);

        radioGroup1 = (RadioGroup) findViewById(R.id.radio_group1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radio_group2);
        radioGroup3 = (RadioGroup) findViewById(R.id.radio_group3);
        radioGroup4 = (RadioGroup) findViewById(R.id.radio_group4);
        value_cash = Double.parseDouble(text_cash.getText().toString());
        cash = value_cash;
        guadagno = 0.0;
    }

    public void choice2015(View view) {
        double sum = 0.0;

        sum = guadagno + cash;
        Intent intent = new Intent(this, Choise2015.class);
        intent.putExtra(EXTRA_MESSAGE, String.valueOf(sum));
        startActivity(intent);

    }


    public void onRadioButtonClicked1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_1_0:
                if (checked)
                    // 0%
                    guadagno = guadagno + value_cash * 0 * (1 + 2.6207);
                cash = cash - value_cash * 0;
                break;
            case R.id.radio_1_1:
                if (checked)
                    // 25%
                    guadagno = guadagno + value_cash * 0.25 * (1 + 2.6207);
                cash = cash - value_cash * 0.25;
                break;
            case R.id.radio_1_2:
                if (checked)
                    // 50%
                    guadagno = guadagno + value_cash * 0.5 * (1 + 2.6207);
                cash = cash - value_cash * 0.5;
                break;
            case R.id.radio_1_3:
                if (checked)
                    // 75%
                    guadagno = guadagno + value_cash * 0.75 * (1 + 2.6207);
                cash = cash - value_cash * 0.75;
                break;
            case R.id.radio_1_4:
                if (checked)
                    // 100%
                    guadagno = guadagno + value_cash * 1 * (1 + 2.6207);
                cash = cash - value_cash * 1;
                break;
        }
    }



    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_2_0:
                if (checked)
                    // 0%
                    guadagno = guadagno + value_cash * 0 * (1 + 1.2778);
                cash = cash - value_cash * 0;
                break;
            case R.id.radio_2_1:
                if (checked)
                    // 25%
                    guadagno = guadagno + value_cash * 0.25 * (1 + 1.2778);
                cash = cash - value_cash * 0.25;
                break;
            case R.id.radio_2_2:
                if (checked)
                    // 50%
                    guadagno = guadagno + value_cash * 0.5 * (1 + 1.2778);
                cash = cash - value_cash * 0.5;
                break;
            case R.id.radio_2_3:
                if (checked)
                    // 75%
                    guadagno = guadagno + value_cash * 0.75 * (1 + 1.2778);
                cash = cash - value_cash * 0.75;
                break;
            case R.id.radio_2_4:
                if (checked)
                    // 100%
                    guadagno = guadagno + value_cash * 1 * (1 + 1.2778);
                cash = cash - value_cash * 1;
                break;
        }
    }

    public void onRadioButtonClicked3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_3_0:
                if (checked)
                    // 0%
                    guadagno = guadagno + value_cash * 0 * (1 + 4.6087);
                cash = cash - value_cash * 0;
                break;
            case R.id.radio_3_1:
                if (checked)
                    // 25%
                    guadagno = guadagno + value_cash * 0.25 * (1 + 4.6087);
                cash = cash - value_cash * 0.25;
                break;
            case R.id.radio_3_2:
                if (checked)
                    // 50%
                    guadagno = guadagno + value_cash * 0.5 * (1 + 4.6087);
                cash = cash - value_cash * 0.5;
                break;
            case R.id.radio_3_3:
                if (checked)
                    // 75%
                    guadagno = guadagno + value_cash * 0.75 * (1 + 4.6087);
                cash = cash - value_cash * 0.75;
                break;
            case R.id.radio_3_4:
                if (checked)
                    // 100%
                    guadagno = guadagno + value_cash * 1 * (1 + 4.6087);
                cash = cash - value_cash * 1;
                break;
        }
    }

    public void onRadioButtonClicked4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_4_0:
                if (checked)
                    // 0%
                    guadagno = guadagno + value_cash * 0 * (1 + 4.9263);
                cash = cash - value_cash * 0;
                break;
            case R.id.radio_4_1:
                if (checked)
                    // 25%
                    guadagno = guadagno + value_cash * 0.25 * (1 + 4.9263);
                cash = cash - value_cash * 0.25;
                break;
            case R.id.radio_4_2:
                if (checked)
                    // 50%
                    guadagno = guadagno + value_cash * 0.5 * (1 + 4.9263);
                cash = cash - value_cash * 0.5;
                break;
            case R.id.radio_4_3:
                if (checked)
                    // 75%
                    guadagno = guadagno + value_cash * 0.75 * (1 + 4.9263);
                cash = cash - value_cash * 0.75;
                break;
            case R.id.radio_4_4:
                if (checked)
                    // 100%
                    guadagno = guadagno + value_cash * 1 * (1 + 4.9263);
                cash = cash - value_cash * 1;
                break;
        }
    }
}