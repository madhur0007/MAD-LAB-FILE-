package com.example.practical3;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {
    EditText input1;
    EditText input2;
    Button addition;
    Button subtraction;
    Button multiplication;
    Button division;
    TextView tvResult;
    String op= "";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = (EditText) findViewById(R.id.etNum1);
        input2 = (EditText) findViewById(R.id.etNum2); 
        addition = (Button) findViewById(R.id.btnAdd); 
        subtraction = (Button) findViewById(R.id.btnSub);
        multiplication = (Button) findViewById(R.id.btnMult); 
        division = (Button) findViewById(R.id.btnDiv);
        tvResult = (TextView) findViewById(R.id.tvResult);
// set a listener addition.setOnClickListener(this); subtraction.setOnClickListener(this); multiplication.setOnClickListener(this); division.setOnClickListener(this);
        addition.setOnClickListener((OnClickListener) this);
        subtraction.setOnClickListener((OnClickListener) this);
        multiplication.setOnClickListener((OnClickListener) this);
        division.setOnClickListener((OnClickListener) this); }
    @Override
    public void onClick(View v) {
       float num1=0;
        float num2 = 0;
        float result = 0;

        if (TextUtils.isEmpty(input1.getText().toString())
                || TextUtils.isEmpty(input2.getText().toString()))
        { return;
        }
        num1 = Float.parseFloat(input1.getText().toString());
        num2 = Float.parseFloat(input2.getText().toString());
        switch (v.getId()) {
        case R.id.btnAdd:
            op = "+";
        result = num1 + num2;
        break;
        case R.id.btnSub:
            op = "-";
        result = num1-num2;
        break;
        case R.id.btnMult:
            op = "*";
        result = num1*num2;
        break;
        case R.id.btnDiv:
            op = "/";
        result = num1/num2;

        break;
        default:
        break;
    }
// form the output line
tvResult.setText(num1 + " " + op + " " + num2 + " = " + result);}}


