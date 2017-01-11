package com.example.a4802.rjabiblioteca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaCursos extends AppCompatActivity {

    Button efi, efii, em, rom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cursos);

        efi = (Button) findViewById(R.id.botefI);
        efii = (Button) findViewById(R.id.botefII);
        em = (Button) findViewById(R.id.botem);
        rom = (Button) findViewById(R.id.botrom);


        efi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_efi);
            }
        });

        efii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_efii);
            }
        });

        em.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_em);
            }
        });

        rom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tela_livros);
            }
        });

    }

}
