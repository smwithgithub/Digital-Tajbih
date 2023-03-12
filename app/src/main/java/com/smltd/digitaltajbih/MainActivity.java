package com.smltd.digitaltajbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtVeiw; Button rstBtn, subBtn, addBtn;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtVeiw = findViewById(R.id.txtVeiw);
        rstBtn = findViewById(R.id.rstBtn);
        subBtn = findViewById(R.id.subBtn);
        addBtn = findViewById(R.id.addBtn);


        rstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                txtVeiw.setText(""+count);
            }
        });


        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                txtVeiw.setText(""+count);
            }
        });


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                txtVeiw.setText(""+count);
            }
        });



    }
}