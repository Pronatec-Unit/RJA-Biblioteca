package com.example.a4802.rjabiblioteca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaEFII extends AppCompatActivity {

    Button porII, matII, hisII, geoII, cieII, leII;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_efii);

        porII = (Button)findViewById(R.id.efiiport);
        matII = (Button)findViewById(R.id.efiimat);
        hisII = (Button)findViewById(R.id.efiihis);
        geoII = (Button)findViewById(R.id.efiigeo);
        cieII = (Button)findViewById(R.id.efiicie);
        leII = (Button)findViewById(R.id.efiilse);


        porII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });

        matII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        hisII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        geoII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        cieII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        leII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
    }
}
