package com.example.tallermen.constantes;

public enum mensajesString {

    MENSAJE_CORRECTO("Tu cálculo es correcto"),
    MENSAJE_SUMA_CORRECTA("El resultado de la suma es correcto"),
    MENSAJE_RESTA_CORRECTA("El resultado de la resta es correcto"),
    MENSAJE_MULT_CORRECTA("El resultado de la multiplicación es correcto"),
    MENSAJE_DIVISION_CORRECTA("El resultadp de la división es correcto"),
    MENSAJE_SUMA_INCORRECTA("El resultado de la suma es incorrecto, puedes inténtalo nuevamente"),
    MENSAJE_RESTA_INCORRECTA("El resultado de la resta es incorrecto, inténtalo nuevamente"),
    MENSAJE_MULT_INCORRECTA("El resultado de la multiplicación es incorrecto, inténtalo nuevamente "),
    MENSAJE_DIVISION_INCORRECTA("El resultadp de la división es incorrecto, inténtalo nuevamente"),
    MENSAJE_CALCULO("El cálculo es:"),
    MENSAJE_NEGATIVO_SUMA("No lograste acertar la suma."),
    MENSAJE_NEGATIVO_RESTA("No lograste acertar la resta."),
    MENSAJE_NEGATIVO_MULT("No lograste acertar la multiplicación."),
    MENSAJE_NEGATIVO_DIVISION("No lograste acertar la división.");

    private String mensaje;

    mensajesString(String mensaje){ this.mensaje= mensaje; }

    public String getMensaje(){return  mensaje;}
}
