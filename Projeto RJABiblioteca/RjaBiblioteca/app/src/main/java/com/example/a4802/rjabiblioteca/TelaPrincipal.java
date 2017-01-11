package com.example.a4802.rjabiblioteca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.logging.Handler;

public class TelaPrincipal extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        android.os.Handler handler = new android.os.Handler();
        handler.postDelayed(this, 2000);
    }

    @Override
    public void run(){
        startActivity(new Intent(TelaPrincipal.this, TelaCursos.class));
        finish();
    }
}


