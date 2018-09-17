package com.example.spaceimpactor.houser.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.spaceimpactor.houser.R;

public class Splash extends AppCompatActivity {

    TextView name;
    ImageView logo;
    Animation frombottom,fromtop;

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i = new Intent(Splash.this, LoginActivity.class);
                startActivity(i);

                finish();
            }
        }, SPLASH_TIME_OUT);

//        ImageView logo =(ImageView) findViewById(R.id.logo);
//        logo.animate().translationXBy(-1000f).setDuration(1500);

        name=(TextView) findViewById(R.id.name);
        logo=(ImageView) findViewById(R.id.logo);
        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);
        name.setAnimation(frombottom);
        logo.setAnimation(fromtop);

    }

}
