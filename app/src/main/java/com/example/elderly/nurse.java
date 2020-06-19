package com.example.elderly;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class nurse extends AppCompatActivity {
    Button nurseb;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nurse);
        nurseb=(Button)findViewById(R.id.nurseb1);
        nurseb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(nurse.this, Googlepay.class);
                startActivity(intent);
            }
        });
    }
}
