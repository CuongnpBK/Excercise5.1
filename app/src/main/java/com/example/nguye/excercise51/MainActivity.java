package com.example.nguye.excercise51;

import android.app.Activity;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
    View tvColor1, tvColor2, tvColor3;
    ImageButton btnRed, btnBlue;
    RadioButton rbRed, rbBlue, rbYellow;
    ToggleButton tbRed, tbBlue, tbYellow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvColor1.setBackgroundColor(Color.RED);
            }
        });
        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvColor1.setBackgroundColor(Color.BLUE);
            }
        });

        rbRed.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tvColor2.setBackgroundColor(Color.RED);
                }
            }
        });
        rbBlue.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tvColor2.setBackgroundColor(Color.BLUE);
                }
            }
        });
        rbYellow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tvColor2.setBackgroundColor(Color.YELLOW);
                }
            }
        });

        tbRed.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tvColor3.setBackgroundColor(Color.RED);
                }
                else {
                    tvColor3.setBackgroundColor(Color.BLACK);
                }
            }
        });
        tbBlue.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tvColor3.setBackgroundColor(Color.BLUE);
                }
                else {
                    tvColor3.setBackgroundColor(Color.BLACK);
                }
            }
        });
        tbYellow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tvColor3.setBackgroundColor(Color.YELLOW);
                }
                else {
                    tvColor3.setBackgroundColor(Color.BLACK);
                }
            }
        });

    }



    public void addControls() {
        tvColor1 = findViewById(R.id.tvColor1);
        tvColor2 = findViewById(R.id.tvColor2);
        tvColor3 = findViewById(R.id.tvColor3);
        btnRed = (ImageButton) findViewById(R.id.btnRed);
        btnBlue = (ImageButton) findViewById(R.id.btnBlue);
        tbBlue = (ToggleButton) findViewById(R.id.tbBlue);
        tbRed = (ToggleButton) findViewById(R.id.tbRed);
        tbYellow = (ToggleButton) findViewById(R.id.tbYellow);
        rbRed = (RadioButton) findViewById(R.id.rbRed);
        rbBlue = (RadioButton) findViewById(R.id.rbBlue);
        rbYellow = (RadioButton) findViewById(R.id.rbYellow);
    }
}
