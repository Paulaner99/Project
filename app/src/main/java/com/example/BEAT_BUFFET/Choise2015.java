package com.example.BEAT_BUFFET;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.BEAT_BUFFET.MainActivity.msec;
import static com.example.BEAT_BUFFET.MainActivity.music;

public class Choise2015 extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.BEAT_BUFFET.MESSAGE";
    RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4;
    float guadagno;
    float cash;
    float value_cash;
    int percentuale;
    float g1, g2, g3, g4;
    float c1, c2, c3, c4;
    int p1, p2, p3, p4;
    boolean change_act = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choise2015);

        Intent intent = getIntent();

        String cash2015 = intent.getStringExtra(Choise2010.EXTRA_MESSAGE);

        TextView text_cash = findViewById(R.id.cash_value_2015);
        text_cash.setText(cash2015);

        radioGroup1 = (RadioGroup) findViewById(R.id.radio_group1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radio_group2);
        radioGroup3 = (RadioGroup) findViewById(R.id.radio_group3);
        radioGroup4 = (RadioGroup) findViewById(R.id.radio_group4);
        value_cash = Float.parseFloat(text_cash.getText().toString());
        cash = value_cash;
        guadagno = 0.0f;
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

    public void Risultato(View view) {
        float sum = 0.0f;

        guadagno = g1 + g2 + g3 + g4;
        cash = value_cash - (c1 + c2 + c3 + c4);
        percentuale = p1 + p2 + p3 + p4;
        sum = guadagno + cash;
        if(percentuale > 100)
        {
            CharSequence text = "Investi al massimo il 100%";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
        }
        else
        {
            Intent intent = new Intent(this, Risultato.class);
            intent.putExtra(EXTRA_MESSAGE, String.valueOf(sum));
            change_act = true;
            startActivity(intent);
        }


    }

    public void onRadioButtonClicked1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_1_0:
                if (checked)
                    // 0%
                    g1 = (float) (value_cash * 0 * (1 + 3.5738));
                    c1 = (float) (value_cash * 0);
                    p1 = 0;
                    break;
            case R.id.radio_1_1:
                if (checked)
                    // 25%
                    g1 = (float) (value_cash * 0.25 * (1 + 3.5738));
                    c1 = (float) (value_cash * 0.25);
                    p1 = 25;
                    break;
            case R.id.radio_1_2:
                if (checked)
                    // 50%
                    g1 = (float) (value_cash * 0.5 * (1 + 3.5738));
                    c1 = (float) (value_cash * 0.5);
                    p1 = 50;
                    break;
            case R.id.radio_1_3:
                if (checked)
                    // 75%
                    g1 = (float) (value_cash * 0.75 * (1 + 3.5738));
                    c1 = (float) (value_cash * 0.75);
                    p1 = 75;
                    break;
            case R.id.radio_1_4:
                if (checked)
                    // 100%
                    g1 = (float) (value_cash * 1 * (1 + 3.5738));
                    c1 = (float) (value_cash * 1);
                    p1 = 100;
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
                    g2 = (float) (value_cash * 0 * (1 + 2.4447));
                    c2 = (float) (value_cash * 0);
                    p2 = 0;
                    break;
            case R.id.radio_2_1:
                if (checked)
                    // 25%
                    g2 = (float) (value_cash * 0.25 * (1 + 2.4447));
                    c2 = (float) (value_cash * 0.25);
                    p2 = 25;
                    break;
            case R.id.radio_2_2:
                if (checked)
                    // 50%
                    g2 = (float) (value_cash * 0.5 * (1 + 2.4447));
                    c2 = (float) (value_cash * 0.5);
                    p2 = 50;
                    break;
            case R.id.radio_2_3:
                if (checked)
                    // 75%
                    g2 = (float) (value_cash * 0.75 * (1 + 2.4447));
                    c2 = (float) (value_cash * 0.75);
                    p2 = 75;
                    break;
            case R.id.radio_2_4:
                if (checked)
                    // 100%
                    g2 = (float) (value_cash * 1 * (1 + 2.4447));
                    c2 = (float) (value_cash * 1);
                    p2 = 100;
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
                    g3 = (float) (value_cash * 0 * (1 - 0.4035));
                    c3 = (float) (value_cash * 0);
                    p3 = 0;
                    break;
            case R.id.radio_3_1:
                if (checked)
                    // 25%
                    g3 = (float) (value_cash * 0.25 * (1 - 0.4035));
                    c3 = (float) (value_cash * 0.25);
                    p3 = 25;
                    break;
            case R.id.radio_3_2:
                if (checked)
                    // 50%
                    g3 = (float) (value_cash * 0.5 * (1 - 0.4035));
                    c3 = (float) (value_cash * 0.5);
                    p3 = 50;
                    break;
            case R.id.radio_3_3:
                if (checked)
                    // 75%
                    g3 = (float) (value_cash * 0.75 * (1 - 0.4035));
                    c3 = (float) (value_cash * 0.75);
                    p3 = 75;
                    break;
            case R.id.radio_3_4:
                if (checked)
                    // 100%
                    g3 = (float) (value_cash * 1 * (1 - 0.4035));
                    c3 = (float) (value_cash * 1);
                    p3 = 100;
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
                    g4 = (float) (value_cash * 0 * (1 - 0.1299));
                    c4 = (float) (value_cash * 0);
                    p4 = 0;
                    break;
            case R.id.radio_4_1:
                if (checked)
                    // 25%
                    g4 = (float) (value_cash * 0.25 * (1 - 0.1299));
                    c4 = (float) (value_cash * 0.25);
                    p4 = 25;
                    break;
            case R.id.radio_4_2:
                if (checked)
                    // 50%
                    g4 = (float) (value_cash * 0.5 * (1 - 0.1299));
                    c4 = (float) (value_cash * 0.5);
                    p4 = 50;
                    break;
            case R.id.radio_4_3:
                if (checked)
                    // 75%
                    g4 = (float) (value_cash * 0.75 * (1 - 0.1299));
                    c4 = (float) (value_cash * 0.75);
                    p4 = 75;
                    break;
            case R.id.radio_4_4:
                if (checked)
                    // 100%
                    g4 = (float) (value_cash * 1 * (1 - 0.1299));
                    c4 = (float) (value_cash * 1);
                    p4 = 100;
                    break;
        }
    }

}