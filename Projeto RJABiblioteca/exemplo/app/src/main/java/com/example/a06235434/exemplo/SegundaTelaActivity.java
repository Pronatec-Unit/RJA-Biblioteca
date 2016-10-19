package com.example.a06235434.exemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaTelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        Button ENSINOFUNDAMENTALI = (Button)findViewById(R.id.botefI);

        ENSINOFUNDAMENTALI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SegundaTelaActivity.this, TerceiraTelaActivity.class);
                startActivity(intent);
            }
        });

        Button ENSINOFUNDAMENTALII = (Button)findViewById(R.id.botefII);

        ENSINOFUNDAMENTALII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SegundaTelaActivity.this, QuartaTelaActivity.class);
                startActivity(intent);
            }
        });

        Button ENSINOMEDIO = (Button)findViewById(R.id.botem);

        ENSINOMEDIO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SegundaTelaActivity.this,QuintaTelaActivity.class );
                startActivity(intent);
            }
        });

        Button ROMANCE = (Button)findViewById(R.id.botrom);

        ROMANCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SegundaTelaActivity.this, QuintaTelaActivity.class);
                startActivity(intent);
            }
        });
    }

}
