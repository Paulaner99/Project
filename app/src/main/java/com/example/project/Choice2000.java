package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Choice2000 extends AppCompatActivity {

    private TextView text_cash;
    float guadagno= (float) 0.0,cash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice2000);

        text_cash = (TextView) findViewById(R.id.cash_value_text_view);
    }

    public void choice2005(View view) {
        Intent intent = new Intent(this, Choise2010.class);
        startActivity(intent);
    }


    public void onRadioButtonClicked1(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group1);
        float value_cash=Float.parseFloat(text_cash.getText().toString());
        float guadagno1= (float) 0.0;

        int id = radioGroup.getCheckedRadioButtonId();
        switch(id) {
            case R.id.radio_1_1:
                // 25%
            {
                guadagno1= (float) (value_cash*0.191575);
                cash= (float) (value_cash-(value_cash*0.25));
            }

            break;
            case R.id.radio_1_2:
                // 50%
            {
                guadagno1= (float) (value_cash*0.38315);
                cash= (float) (value_cash-(value_cash*0.5));
            }

            break;
            case R.id.radio_1_3:
                // 75%
            {
                guadagno1= (float) (value_cash*0.574725);
                cash= (float) (value_cash-(value_cash*0.75));
            }

            break;
            case R.id.radio_1_4:
                // 100%
            {
                guadagno1= (float) (value_cash*0.7663);
                cash= (float) (value_cash-value_cash);
            }

            break;
            default:

        }
        guadagno=guadagno+guadagno1;
    }
    public void onRadioButtonClicked2(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group1);
        float value_cash=Float.parseFloat(text_cash.getText().toString());
        float guadagno2= (float) 0.0;

        int id = radioGroup.getCheckedRadioButtonId();
        switch(id) {
            case R.id.radio_1_1:
                // 25%
            {
                guadagno2= (float) (cash*0.0875);
                cash= (float) (cash-(cash*0.25));
            }

            break;
            case R.id.radio_1_2:
                // 50%
            {
                guadagno2= (float) (cash*0.175);
                cash= (float) (cash-(cash*0.5));
            }

            break;
            case R.id.radio_1_3:
                // 75%
            {
                guadagno2= (float) (cash*0.2625);
                cash= (float) (cash-(cash*0.75));
            }

            break;
            case R.id.radio_1_4:
                // 100%
            {
                guadagno2= (float) (cash*0.35);
                cash= (float) (cash-cash);
            }

            break;
            default:

        }
        guadagno=guadagno+guadagno2;
    }
    public void onRadioButtonClicked3(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group1);
        float value_cash=Float.parseFloat(text_cash.getText().toString());
        float guadagno3= (float) 0.0;

        int id = radioGroup.getCheckedRadioButtonId();
        switch(id) {
            case R.id.radio_1_1:
                // 25%
            {
                guadagno3= (float) (cash*0.48935);
                cash= (float) (cash-(cash*0.25));
            }

            break;
            case R.id.radio_1_2:
                // 50%
            {
                guadagno3= (float) (cash*0.9787);
                cash= (float) (cash-(cash*0.5));
            }

            break;
            case R.id.radio_1_3:
                // 75%
            {
                guadagno3= (float) (cash*1.46805);
                cash= (float) (cash-(cash*0.75));
            }

            break;
            case R.id.radio_1_4:
                // 100%
            {
                guadagno3= (float) (cash*1.9574);
                cash= (float) (cash-cash);
            }

            break;
            default:

        }
        guadagno=guadagno+guadagno3;
    }
    public void onRadioButtonClicked4(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group1);
        float value_cash=Float.parseFloat(text_cash.getText().toString());
        float guadagno4= (float) 0.0;

        int id = radioGroup.getCheckedRadioButtonId();
        switch(id) {
            case R.id.radio_1_1:
                // 25%
            {
                guadagno4= (float) (cash*0.3224);
                cash= (float) (cash-(cash*0.25));
            }

            break;
            case R.id.radio_1_2:
                // 50%
            {
                guadagno4= (float) (cash*0.6448);
                cash= (float) (cash-(cash*0.5));
            }

            break;
            case R.id.radio_1_3:
                // 75%
            {
                guadagno4= (float) (cash*0.9672);
                cash= (float) (cash-(cash*0.75));
            }

            break;
            case R.id.radio_1_4:
                // 100%
            {
                guadagno4= (float) (cash*1.2896);
                cash= (float) (cash-cash);
            }

            break;
            default:

        }
        guadagno=guadagno+guadagno4;
    }

}