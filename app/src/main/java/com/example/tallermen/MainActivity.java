package com.example.tallermen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button calculoMatematico;
    Button culturaGeneral;
    Button notas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculoMatematico=findViewById(R.id.btncalculo);
        culturaGeneral= findViewById(R.id.btncultura);
        notas=findViewById(R.id.btnnotas);
        
        calculoMatematico.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent ventanacalculomatematico = new Intent(MainActivity.this, calculomatematico.class);
                startActivity(ventanacalculomatematico);

            }

        });

        culturaGeneral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ventanaCulturaGeneral = new Intent(MainActivity.this, culturaGeneral.class);
                startActivity(ventanaCulturaGeneral);
            }
        });

       /* notas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ventanaNotas = new Intent(MainActivity.this, CalificacionesAlumnos.class);
                startActivity(ventanaNotas);
            }
        });*/
    }
}
