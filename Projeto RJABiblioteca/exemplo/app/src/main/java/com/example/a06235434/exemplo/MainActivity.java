package com.example.a06235434.exemplo;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements Runnable{

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();
        handler.postDelayed(this, 2000);
    }

    @Override
    public void run(){
        startActivity(new Intent(this, PrimeiraTelaActivity.class));
        finish();
    }
}