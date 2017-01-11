package com.example.a4802.rjabiblioteca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaEM extends AppCompatActivity {

    Button ptem, matem, hisem, fisem, quiem, bioem, geoem, lseem, litem, filem, socem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_em);

        ptem = (Button) findViewById(R.id.empt);
        matem = (Button) findViewById(R.id.emmt);
        hisem = (Button) findViewById(R.id.emht);
        fisem = (Button) findViewById(R.id.emfs);
        quiem = (Button) findViewById(R.id.emqm);
        bioem = (Button) findViewById(R.id.embg);
        geoem = (Button) findViewById(R.id.emgg);
        lseem = (Button) findViewById(R.id.emle);
        litem = (Button) findViewById(R.id.emlt);
        filem = (Button) findViewById(R.id.emff);
        socem = (Button) findViewById(R.id.emsc);


        ptem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        matem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        hisem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        fisem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        quiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        bioem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        geoem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        lseem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        litem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        filem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        socem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
    }
}
