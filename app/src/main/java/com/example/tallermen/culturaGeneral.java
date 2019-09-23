package com.example.tallermen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class culturaGeneral extends AppCompatActivity {

    TextView preguntaView;
    EditText respuestaView;
    int preguntasR;
    Button validar;
    Button cargar;

    String preguntasA[];
    String respuestasA[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultura_general);

        preguntaView = findViewById(R.id.lblpregunta);
        respuestaView = findViewById(R.id.txtrespuesta);
        validar = findViewById(R.id.btnenviar);
        cargar = findViewById(R.id.btnsiguientep);

        Random random = new Random();

        preguntasA = new String[5];
        respuestasA = new String[5];

        preguntasA[0] = "¿Cuál es lugar más frío de la tierra?";
        respuestasA[0] = "la antartida";

        preguntasA[1] = "¿Quién era el general de los nazis en la Segunda Guerra Mundial?";
        respuestasA[1] = "adolf hitler";

        preguntasA[2] = "¿Cuál es el libro sagrado del Islam?";
        respuestasA[2] = "el coran";

        preguntasA[3] = "¿Cuál es el río más largo del mundo?";
        respuestasA[3] = "el amazonas";

        preguntasA[4] = "¿Quién pintó “la última cena”?";
        respuestasA[4] = "leonardo da vinci";

        preguntasR = random.nextInt(preguntasA.length);

        if (preguntasR == 0) {
            preguntaView.setText(String.valueOf(preguntasA[0]));
        } else if (preguntasR == 1) {
            preguntaView.setText(String.valueOf(preguntasA[1]));
        } else if (preguntasR == 2) {
            preguntaView.setText(String.valueOf(preguntasA[2]));
        } else if (preguntasR == 3) {
            preguntaView.setText(String.valueOf(preguntasA[3]));
        } else if (preguntasR == 4) {
            preguntaView.setText(String.valueOf(preguntasA[4]));
        }

        validar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (preguntasR) {

                    case 0:
                        condpregunta1();
                        break;

                    case 1:
                        condpregunta2();
                        break;

                    case 2:
                        condpregunta3();
                        break;

                    case 3:
                        condpregunta4();
                        break;

                    case 4:
                        condpregunta5();
                        break;

                    default:
                        Toast.makeText(culturaGeneral.this, "No hay", Toast.LENGTH_LONG).show();
                        break;
                }

            }
        });

        cargar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
                startActivity(getIntent());
            }
        });
    }

    public void condpregunta1() {
        if (preguntaView.getText().toString().equals(preguntasA[0]) && respuestaView.getText().toString().equals(respuestasA[0])) {
            Toast.makeText(culturaGeneral.this, "¡Tu respuesta es correcta!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(culturaGeneral.this, "Respuesta Incorrecta", Toast.LENGTH_SHORT).show();
        }
    }
    public void condpregunta2(){
        if(preguntaView.getText().toString().equals(preguntasA[1]) && respuestaView.getText().toString().equals(respuestasA[1]) ){
            Toast.makeText(culturaGeneral.this, "¡Tu respuesta es correcta!", Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(culturaGeneral.this, "Respuesta Incorrecta", Toast.LENGTH_SHORT).show();
        }
    }

    public void condpregunta3(){
        if(preguntaView.getText().toString().equals(preguntasA[2]) && respuestaView.getText().toString().equals(respuestasA[2]) ){
            Toast.makeText(culturaGeneral.this, "¡Tu respuesta es correcta!", Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(culturaGeneral.this, "Respuesta Incorrecta", Toast.LENGTH_SHORT).show();
        }
    }

    public void condpregunta4(){
        if(preguntaView.getText().toString().equals(preguntasA[3]) && respuestaView.getText().toString().equals(respuestasA[3]) ){
            Toast.makeText(culturaGeneral.this, "¡Tu respuesta es correcta!", Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(culturaGeneral.this, "Respuesta Incorrecta", Toast.LENGTH_SHORT).show();
        }
    }

    public void condpregunta5(){
        if(preguntaView.getText().toString().equals(preguntasA[4]) && respuestaView.getText().toString().equals(respuestasA[4]) ){
            Toast.makeText(culturaGeneral.this, "¡Tu respuesta es correcta!", Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(culturaGeneral.this, "Respuesta Incorrecta", Toast.LENGTH_SHORT).show();
        }
    }
}