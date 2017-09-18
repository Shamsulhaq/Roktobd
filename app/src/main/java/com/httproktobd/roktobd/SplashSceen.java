package com.httproktobd.roktobd;

import android.content.Intent;
import android.os.UserHandle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashSceen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_sceen);
        Thread myThread = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(4000);
                    startActivity(new Intent(SplashSceen.this,MainActivity.class));
                    finish();
                }catch (Exception e){}
                super.run();
            }
        };
        myThread.start();

    }
}
