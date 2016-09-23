package com.example.rithvik.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView result;
    private double calc;
    private Button clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        result = (TextView) findViewById(R.id.Result);
        clear = (Button) findViewById(R.id.Clear);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num1.getText().length() > 0 && num2.getText().length() > 0) {
                    calc = Double.parseDouble(num1.getText().toString()) + Double.parseDouble(num2.getText().toString());
                    result.setText(Double.toString(calc));
                } else {

                    Toast.makeText(MainActivity.this, "Enter a Number", Toast.LENGTH_LONG);

                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num1.getText().length() > 0 && num2.getText().length() > 0) {
                    calc = Double.parseDouble(num1.getText().toString()) - Double.parseDouble(num2.getText().toString());
                    result.setText(Double.toString(calc));
                } else {

                    Toast.makeText(MainActivity.this, "Enter a Number", Toast.LENGTH_LONG);

                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num1.getText().length() > 0 && num2.getText().length() > 0) {
                    calc = Double.parseDouble(num1.getText().toString()) * Double.parseDouble(num2.getText().toString());
                    result.setText(Double.toString(calc));
                } else {

                    Toast.makeText(MainActivity.this, "Enter a Number", Toast.LENGTH_LONG);

                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num1.getText().length() > 0 && num2.getText().length() > 0) {
                    calc = Double.parseDouble(num1.getText().toString()) / Double.parseDouble(num2.getText().toString());
                    result.setText(Double.toString(calc));
                } else {

                    Toast.makeText(MainActivity.this, "Enter a Number", Toast.LENGTH_LONG);

                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               num1.setText("");
                num2.setText("");
                result.setText("0.0");
                num1.requestFocus();
            }
        });

    }
}
