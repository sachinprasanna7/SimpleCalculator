package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    private EditText inpnum1;
    private EditText inpnum2;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inpnum1 =  findViewById(R.id.inpnum1);
        inpnum2 =  findViewById(R.id.inpnum2);
        tvResult =  findViewById(R.id.tvResult);

    }

    public void btnsum(View view) {
        int num1 = Integer.parseInt(inpnum1.getText().toString());
        int num2 = Integer.parseInt(inpnum2.getText().toString());
        int sum = num1+num2;
        tvResult.setText(String.valueOf(sum));

    }

    public void btnsub(View view) {
        int num1 = Integer.parseInt(inpnum1.getText().toString());
        int num2 = Integer.parseInt(inpnum2.getText().toString());
        int sub = num1-num2;
        tvResult.setText(String.valueOf(sub));

    }

    public void btnmulti(View view) {
        int num1 = Integer.parseInt(inpnum1.getText().toString());
        int num2 = Integer.parseInt(inpnum2.getText().toString());
        int mult = num1*num2;
        tvResult.setText(String.valueOf(mult));
    }


    public void btndiv(View view) {
        int num1 = Integer.parseInt(inpnum1.getText().toString());
        int num2 = Integer.parseInt(inpnum2.getText().toString());
        float nump1 = num1;
        float div = nump1/num2;
        float numfinal = BigDecimal.valueOf(div)
                .setScale(2, BigDecimal.ROUND_HALF_DOWN)
                .floatValue();
        tvResult.setText(String.valueOf(numfinal));
    }
}