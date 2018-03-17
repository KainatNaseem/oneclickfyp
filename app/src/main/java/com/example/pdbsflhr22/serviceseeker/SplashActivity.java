package com.example.pdbsflhr22.serviceseeker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends Activity {
private TextView texv;
private ImageView imv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        texv= (TextView) findViewById(R.id.texv);
        imv = (ImageView) findViewById(R.id.imv);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        texv.startAnimation(myanim);
        imv.startAnimation(myanim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashActivity.this, SelectionActivity.class);
                startActivity(i);
                finish();

            }

            //3000 is the time in milli seconds
        }, 3000);
    }

    public TextView getTv() {
        return texv;
    }
}
