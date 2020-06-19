package com.example.elderly;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class updated extends AppCompatActivity {
    Button updatedb;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updated);
        updatedb=(Button)findViewById(R.id.updatedb1);
        updatedb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(updated.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}