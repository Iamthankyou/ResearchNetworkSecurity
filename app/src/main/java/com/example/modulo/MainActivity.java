package com.example.modulo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnModuloDivide;
    private Button btnModuloRevert;
    private Button btnCheckPrime,btnFactPrime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnModuloDivide = (Button)findViewById(R.id.btnModuloDivide);
        btnModuloRevert = (Button)findViewById(R.id.btnModuloRevert);
        btnCheckPrime = (Button)findViewById(R.id.btnCheckPrime);
        btnFactPrime = (Button)findViewById(R.id.btnFactPrime);

        btnModuloDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuloDivide.class);
                startActivity(intent);
            }
        });


        btnModuloRevert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RevertModulo.class);
                startActivity(intent);
            }
        });

        btnCheckPrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CheckPrime.class);
                startActivity(intent);
            }
        });

        btnFactPrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FactPrime.class);
                startActivity(intent);
            }
        });
    }
}