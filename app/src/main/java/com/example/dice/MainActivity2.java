package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    TextView textResultado;
    Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textResultado = findViewById(R.id.textResultado);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        Bundle dados = getIntent().getExtras();
        int num = dados.getInt("num");

        int random = new Random().nextInt(num);
        int resultado = random + 1;

        textResultado.setText(resultado + "/" + num);

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });

    }
}