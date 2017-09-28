package com.example.gyorgyitamas.szamologep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button bttn1,bttn2,bttn3,bttn4,bttn5,bttn6,bttn7,bttn8,bttn9,bttn0;
    private Button bttnC;
    private EditText editTxt;

    private int memoria;
    private String afterValue;
    private String currentValue;
    private int aritmetik;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bttn1 = (Button)findViewById(R.id.button1);
        this.bttn2 = (Button)findViewById(R.id.button2);
        this.bttn3 = (Button)findViewById(R.id.button3);
        this.bttn4 = (Button)findViewById(R.id.button4);
        this.bttn5 = (Button)findViewById(R.id.button5);
        this.bttn6 = (Button)findViewById(R.id.button6);
        this.bttn7 = (Button)findViewById(R.id.button7);
        this.bttn8 = (Button)findViewById(R.id.button8);
        this.bttn9 = (Button)findViewById(R.id.button9);
        this.bttn0 = (Button)findViewById(R.id.button0);

        this.bttnC = (Button)findViewById(R.id.buttonClear);


        this.editTxt = (EditText)findViewById(R.id.editText);

        currentValue = "";

        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentValue += "1";
                editTxt.setText(currentValue);
            }
        });
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentValue += "2";
                editTxt.setText(currentValue);
            }
        });
        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentValue += "3";
                editTxt.setText(currentValue);
            }
        });
        bttn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentValue += "4";
                editTxt.setText(currentValue);
            }
        });
        bttn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentValue += "5";
                editTxt.setText(currentValue);
            }
        });
        bttn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentValue += "6";
                editTxt.setText(currentValue);
            }
        });
        bttn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentValue += "7";
                editTxt.setText(currentValue);
            }
        });
        bttn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentValue += "8";
                editTxt.setText(currentValue);
            }
        });
        bttn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentValue += "9";
                editTxt.setText(currentValue);
            }
        });
        bttnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentValue = "0";
                editTxt.setText(currentValue);
            }
        });
    }







}
