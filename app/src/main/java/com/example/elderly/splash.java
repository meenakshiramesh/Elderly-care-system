package com.example.elderly;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.elderly.MainActivity;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {
    private static int SPLASH_SCREEN=5000;
    //variables
    Animation topanim,bottomanim;
    ImageView image;
    TextView text,slogan;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        //Animations
        topanim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomanim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //setAnimation
        image=findViewById(R.id.image1);
        text=findViewById(R.id.textView00);
        slogan=findViewById(R.id.textView000);

        image.setAnimation(topanim);
        text.setAnimation(bottomanim);
        slogan.setAnimation(bottomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);


    }
}
