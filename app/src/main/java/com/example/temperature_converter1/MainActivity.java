package com.example.temperature_converter1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    EditText e;
    Button b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e = findViewById(R.id.editTextNumber2);
        b3= findViewById(R.id.button3);
        b2= findViewById(R.id.button2);
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double p= Double.parseDouble(e.getText().toString());
                double k= ((p-32)*5)/9;
                e.setText(String.format("%.2f",k));
                Toast.makeText(MainActivity.this, String.format("%.2f",k)+ "C", Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double p1= Double.parseDouble(e.getText().toString());
                double k1= ((1.8*p1)+ 32);
                e.setText(String.format("%.2f",k1));
                Toast.makeText(MainActivity.this, String.format("%.2f",k1)+ "F", Toast.LENGTH_SHORT).show();
            }
        });
    }
}