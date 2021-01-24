package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Choice2005 extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.project.MESSAGE";
    RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4;
    float guadagno;
    float cash;
    float value_cash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice2005);

        Intent intent = getIntent();

        String cash2005 = intent.getStringExtra(Choice2000.EXTRA_MESSAGE);

        TextView text_cash = findViewById(R.id.cash_value_2005);
        text_cash.setText(cash2005);

        radioGroup1 = (RadioGroup) findViewById(R.id.radio_group1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radio_group2);
        radioGroup3 = (RadioGroup) findViewById(R.id.radio_group3);
        radioGroup4 = (RadioGroup) findViewById(R.id.radio_group4);
        value_cash = Float.parseFloat(text_cash.getText().toString());
        cash = value_cash;
        guadagno = 0.0f;
    }

    public void choice2010(View view) {
        float sum = 0.0f;

        sum = guadagno + cash;
        Intent intent = new Intent(this, Choise2010.class);
        intent.putExtra(EXTRA_MESSAGE, String.valueOf(sum));
        startActivity(intent);

    }


    public void onRadioButtonClicked1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_1_0:
                if (checked)
                    // 0%
                    guadagno = (float) (guadagno + value_cash * 0 * (1 + 0.6640));
                cash = (float) (cash - value_cash * 0);
                break;
            case R.id.radio_1_1:
                if (checked)
                    // 25%
                    guadagno = (float) (guadagno + value_cash * 0.25 * (1 + 0.6640));
                cash = (float) (cash - value_cash * 0.25);
                break;
            case R.id.radio_1_2:
                if (checked)
                    // 50%
                    guadagno = (float) (guadagno + value_cash * 0.5 * (1 + 0.6640));
                cash = (float) (cash - value_cash * 0.5);
                break;
            case R.id.radio_1_3:
                if (checked)
                    // 75%
                    guadagno = (float) (guadagno + value_cash * 0.75 * (1 + 0.6640));
                cash = (float) (cash - value_cash * 0.75);
                break;
            case R.id.radio_1_4:
                if (checked)
                    // 100%
                    guadagno = (float) (guadagno + value_cash * 1 * (1 + 0.6640));
                cash = (float) (cash - value_cash * 1);
                break;
        }
    }


    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_2_0:
                if (checked)
                    // 0%
                    guadagno = (float) (guadagno + value_cash * 0 * (1 + 0.2181));
                cash = (float) (cash - value_cash * 0);
                break;
            case R.id.radio_2_1:
                if (checked)
                    // 25%
                    guadagno = (float) (guadagno + value_cash * 0.25 * (1 + 0.2181));
                cash = (float) (cash - value_cash * 0.25);
                break;
            case R.id.radio_2_2:
                if (checked)
                    // 50%
                    guadagno = (float) (guadagno + value_cash * 0.5 * (1 + 0.2181));
                cash = (float) (cash - value_cash * 0.5);
                break;
            case R.id.radio_2_3:
                if (checked)
                    // 75%
                    guadagno = (float) (guadagno + value_cash * 0.75 * (1 + 0.2181));
                cash = (float) (cash - value_cash * 0.75);
                break;
            case R.id.radio_2_4:
                if (checked)
                    // 100%
                    guadagno = (float) (guadagno + value_cash * 1 * (1 + 0.2181));
                cash = (float) (cash - value_cash * 1);
                break;
        }
    }

    public void onRadioButtonClicked3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_3_0:
                if (checked)
                    // 0%
                    guadagno = (float) (guadagno + value_cash * 0 * (1 - 0.6071));
                cash = (float) (cash - value_cash * 0);
                break;
            case R.id.radio_3_1:
                if (checked)
                    // 25%
                    guadagno = (float) (guadagno + value_cash * 0.25 * (1 - 0.6071));
                cash = (float) (cash - value_cash * 0.25);
                break;
            case R.id.radio_3_2:
                if (checked)
                    // 50%
                    guadagno = (float) (guadagno + value_cash * 0.5 * (1 - 0.6071));
                cash = (float) (cash - value_cash * 0.5);
                break;
            case R.id.radio_3_3:
                if (checked)
                    // 75%
                    guadagno = (float) (guadagno + value_cash * 0.75 * (1 - 0.6071));
                cash = (float) (cash - value_cash * 0.75);
                break;
            case R.id.radio_3_4:
                if (checked)
                    // 100%
                    guadagno = (float) (guadagno + value_cash * 1 * (1 - 0.6071));
                cash = (float) (cash - value_cash * 1);
                break;
        }
    }

    public void onRadioButtonClicked4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_4_0:
                if (checked)
                    // 0%
                    guadagno = (float) (guadagno + value_cash * 0 * (1 - 0.2087));
                cash = (float) (cash - value_cash * 0);
                break;
            case R.id.radio_4_1:
                if (checked)
                    // 25%
                    guadagno = (float) (guadagno + value_cash * 0.25 * (1 - 0.2087));
                cash = (float) (cash - value_cash * 0.25);
                break;
            case R.id.radio_4_2:
                if (checked)
                    // 50%
                    guadagno = (float) (guadagno + value_cash * 0.5 * (1 - 0.2087));
                cash = (float) (cash - value_cash * 0.5);
                break;
            case R.id.radio_4_3:
                if (checked)
                    // 75%
                    guadagno = (float) (guadagno + value_cash * 0.75 * (1 - 0.2087));
                cash = (float) (cash - value_cash * 0.75);
                break;
            case R.id.radio_4_4:
                if (checked)
                    // 100%
                    guadagno = (float) (guadagno + value_cash * 1 * (1 - 0.2087));
                cash = (float) (cash - value_cash * 1);
                break;
        }
    }
}