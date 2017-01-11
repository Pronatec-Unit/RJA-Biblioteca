package com.example.a4802.rjabiblioteca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaEFI extends AppCompatActivity {

    Button por, mat, his, geo, cie, le;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_efi);

        por = (Button)findViewById(R.id.portefi);
        mat = (Button)findViewById(R.id.matefi);
        his = (Button)findViewById(R.id.hisefi);
        geo = (Button)findViewById(R.id.geoefi);
        cie = (Button)findViewById(R.id.cieefi);
        le = (Button)findViewById(R.id.lseefi);


        por.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);

            }
        });

        mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        his.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        geo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
        cie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);

            }
        });
        le.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });
    }
}
