package com.example.lenovo.myapplication123;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    private static int a = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final Intent i = new Intent(this,MainActivity.class);
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                startActivity(i);
            }
        },a);
    }
}
