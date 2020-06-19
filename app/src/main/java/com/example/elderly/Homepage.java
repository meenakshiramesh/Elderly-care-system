package com.example.elderly;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Homepage extends AppCompatActivity {
    Button homeb1, homeb2, homeb3, homeb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_homepage);
            homeb1 = (Button) findViewById(R.id.homebutton1);
            homeb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Homepage.this, nurse.class);
                    startActivity(intent);
                }
            });
            homeb2=(Button) findViewById(R.id.homebutton2);
            homeb2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Homepage.this, appointment.class);
                    startActivity(intent);
                }
            });
            homeb3=(Button) findViewById(R.id.homebutton3);
            homeb3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Homepage.this, update.class);
                    startActivity(intent);
                }
            });
            homeb4=(Button) findViewById(R.id.homebutton4);
            homeb4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Homepage.this, MainActivity.class);
                    startActivity(intent);
                }
            });
        }
}