package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button d6, d12, d20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        d6 = findViewById(R.id.d6);
        d12 = findViewById(R.id.d12);
        d20 = findViewById(R.id.d20);

        final Intent intent = new Intent(getApplicationContext(), MainActivity2.class);

        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num = 6;
                intent.putExtra("num", num);

                startActivity(intent);
            }
        });

        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num = 12;
                intent.putExtra("num", num);
                startActivity(intent);

            }
        });

        d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num = 20;
                intent.putExtra("num", num);
                startActivity(intent);

            }
        });

    }
}