package com.sofka.EjerciciosPracticosDel_1_al_15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner datosEntrada = new Scanner((System.in));
        //redondear el resultado a 2 decimales
        DecimalFormat format1 = new DecimalFormat("#.##");
        System.out.println("Area del circulo");
        System.out.println("Ingresar el radio del circulo en metros");
        //obtener el radio del circulo y guardarlo en la variable double r
        double r = Double.parseDouble((datosEntrada.nextLine()));
        //hallar el area del circulo y guardarlo en la variable double a
        double a = Math.PI*Math.pow(r,2);
        System.out.println("El área del circulo es: "+format1.format(a)+" metros");
    }
}
