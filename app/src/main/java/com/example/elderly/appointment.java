package com.example.elderly;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class appointment extends AppCompatActivity {
    Button appointmentb;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
        appointmentb=(Button)findViewById(R.id.appointmentb1);
        appointmentb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(appointment.this, Googlepay.class);
                startActivity(intent);
            }
        });
    }
}