package com.example.tallermen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import static com.example.tallermen.constantes.mensajesString.*;

public class calculomatematico extends AppCompatActivity {

    double rptaNum1;
    double rptaNum2;
    int randomOperacion;
    TextView num1;
    TextView num2;
    TextView operacion;
    TextView auxiliar;
    TextView mensaje;
    EditText resultado;
    Button calcular;
    Button siguiente;

    int contador=0;

    Random random= new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculomatematico);

        num1=findViewById(R.id.lblnumero1);
        num2=findViewById(R.id.lbloperacion);
        operacion=findViewById(R.id.lbloperacion);
        auxiliar=findViewById(R.id.lblresultado);
        mensaje=findViewById(R.id.lblrespuesta);
        resultado=findViewById(R.id.txtresultado);
        calcular=findViewById(R.id.btncalculo);
        siguiente= findViewById(R.id.btnsiguiente);
        
        nRandom();

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacion();

            }
        });

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nRandom();
                auxiliar.setText("");
                mensaje.setText("");
                resultado.setEnabled(true);
                calcular.setEnabled(true);
                limpiarText();

            }
        });

    }

    public void nRandom() {

        rptaNum1 = random.nextInt(10);
        rptaNum2 = random.nextInt(10);
        randomOperacion = random.nextInt(4);

        num1.setText(String.valueOf(rptaNum1));
        num2.setText(String.valueOf(rptaNum2));

        if (randomOperacion==0){
            operacion.setText("+");
        }
        else if(randomOperacion==1){
            operacion.setText("-");
        }
        else if(randomOperacion==2){
            operacion.setText("x");
        }
        else {
            operacion.setText("/");
        }
    }

    public void operacion(){
        switch (randomOperacion){

            case 0:
                suma();
                break;

            case 1:
                resta();
                break;

            case 2:
                multiplicacion();
                break;

            case 3:
                division();
                break;

            default:
                break;
        }
    }

    public void suma() {
        double auxiliarOperacion = Double.parseDouble(resultado.getText().toString());
        double suma = rptaNum1 + rptaNum2;
        if (auxiliarOperacion == suma) {
            mensaje.setVisibility(View.VISIBLE);
            mensaje.setText(MENSAJE_CORRECTO.getMensaje());
            auxiliar.setVisibility(View.VISIBLE);
            auxiliar.setText(rptaNum1 + " " + "+" + " " + rptaNum2 + " = " + (suma));
            limpiarText();
            Toast.makeText(calculomatematico.this, MENSAJE_SUMA_CORRECTA.getMensaje(), Toast.LENGTH_LONG).show();
            contador = 0;
            bloqueoTextBut();
        } else {
            if (contador < 3) {
                contador++;
                Toast.makeText(calculomatematico.this, MENSAJE_SUMA_INCORRECTA.getMensaje(), Toast.LENGTH_LONG).show();
            }
            else {
                contador=0;
                mensaje.setVisibility(View.VISIBLE);
                auxiliar.setVisibility(View.VISIBLE);
                mensaje.setText(MENSAJE_CALCULO.getMensaje());
                auxiliar.setText(rptaNum1 + " " + "+" + " " + rptaNum2 + " = " + (suma));
                limpiarText();
                Toast.makeText(calculomatematico.this, MENSAJE_NEGATIVO_SUMA.getMensaje(), Toast.LENGTH_LONG).show();
                bloqueoTextBut();
            }

        }
    }
    public  void resta(){

        double auxiliarOperacion = Double.parseDouble(resultado.getText().toString());
        double resta = rptaNum1 - rptaNum2;
        if(auxiliarOperacion == resta){
            mensaje.setVisibility(View.VISIBLE);
            auxiliar.setVisibility(View.VISIBLE);
            mensaje.setText(MENSAJE_CORRECTO.getMensaje());
            auxiliar.setText(rptaNum1 + " " + "-" + " " + rptaNum2 + " = " +(resta));
            limpiarText();
            Toast.makeText(calculomatematico.this,MENSAJE_RESTA_CORRECTA.getMensaje() , Toast.LENGTH_LONG).show();
            contador = 0;
            bloqueoTextBut();
        }
        else{
            if(contador < 3){
                contador++;
                Toast.makeText(calculomatematico.this,MENSAJE_RESTA_INCORRECTA.getMensaje() , Toast.LENGTH_LONG).show();
            }
            else {
                contador = 0;
                mensaje.setVisibility(View.VISIBLE);
                auxiliar.setVisibility(View.VISIBLE);
                mensaje.setText("Buena suerte para la próxima, el calculo es: ");
                auxiliar.setText(rptaNum1 + " " + "-" + " " + rptaNum2 + " = " +(resta));
                limpiarText();
                Toast.makeText(calculomatematico.this,MENSAJE_NEGATIVO_RESTA.getMensaje() , Toast.LENGTH_LONG).show();
                bloqueoTextBut();
            }
        }

}

    public void multiplicacion(){
        double auxiliarOperacion = Double.parseDouble(resultado.getText().toString());
        double multiplicacion = rptaNum1 * rptaNum2;
        if(auxiliarOperacion == multiplicacion){
            mensaje.setVisibility(View.VISIBLE);
            auxiliar.setVisibility(View.VISIBLE);
            mensaje.setText(MENSAJE_CORRECTO.getMensaje());
            auxiliar.setText(rptaNum1 + " " + "*" + " " + rptaNum2 + " = " +(multiplicacion));
            limpiarText();
            Toast.makeText(calculomatematico.this, MENSAJE_MULT_CORRECTA.getMensaje(), Toast.LENGTH_LONG).show();
            contador = 0;
            bloqueoTextBut();
        }
        else {
            if(contador < 3){
                contador++;
                Toast.makeText(calculomatematico.this, MENSAJE_MULT_INCORRECTA.getMensaje(), Toast.LENGTH_LONG).show();
            }
            else{
                contador = 0;
                mensaje.setVisibility(View.VISIBLE);
                auxiliar.setVisibility(View.VISIBLE);
                mensaje.setText(MENSAJE_CALCULO.getMensaje());
                auxiliar.setText(rptaNum1 + " " + "*" + " " + rptaNum2 + " = " +(multiplicacion));
                limpiarText();
                Toast.makeText(calculomatematico.this, MENSAJE_NEGATIVO_MULT.getMensaje(), Toast.LENGTH_LONG).show();
                bloqueoTextBut();
            }
        }
    }


    public void division(){
        double auxiliarOperacion = Double.parseDouble(resultado.getText().toString());
        double division = rptaNum1 / rptaNum2;
        if(auxiliarOperacion == division){
            mensaje.setVisibility(View.VISIBLE);
            auxiliar.setVisibility(View.VISIBLE);
            mensaje.setText(MENSAJE_CORRECTO.getMensaje());
            auxiliar.setText(rptaNum1 + " " + "/" + " " + rptaNum2 + " = " + (division));
            limpiarText();
            Toast.makeText(calculomatematico.this, MENSAJE_DIVISION_CORRECTA.getMensaje(), Toast.LENGTH_LONG).show();
            contador = 0;
            bloqueoTextBut();
        }
        else{
            if(contador < 3){
                contador++;
                Toast.makeText(calculomatematico.this, MENSAJE_DIVISION_INCORRECTA.getMensaje(), Toast.LENGTH_LONG).show();
            }
            else{
                contador = 0;
                mensaje.setVisibility(View.VISIBLE);
                auxiliar.setVisibility(View.VISIBLE);
                mensaje.setText(MENSAJE_CALCULO.getMensaje());
                auxiliar.setText(rptaNum1 + " " + "/" + " " + rptaNum2 + " = " + (division));
                limpiarText();
                Toast.makeText(calculomatematico.this, MENSAJE_NEGATIVO_DIVISION.getMensaje(), Toast.LENGTH_LONG).show();
                bloqueoTextBut();
            }
        }
    }

    public void bloqueoTextBut(){
        resultado.setEnabled(false);
        calcular.setEnabled(false);
    }

    public void limpiarText(){
        resultado.setText("");
    }
    }