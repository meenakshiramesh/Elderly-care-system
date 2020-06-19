package com.example.elderly;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class update extends AppCompatActivity {
    Button updateb;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        updateb=(Button)findViewById(R.id.updateb1);
        updateb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(update.this, updated.class);
                startActivity(intent);
            }
        });
    }
}