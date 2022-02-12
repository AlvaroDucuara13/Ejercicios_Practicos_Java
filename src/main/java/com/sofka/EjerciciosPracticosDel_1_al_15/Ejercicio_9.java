package com.sofka.EjerciciosPracticosDel_1_al_15;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner datoEntrada = new Scanner(System.in);
        String fraselocal="La sonrisa sera la mejor arma contra la tristeza";
        String fraseModificada= fraselocal.replace("a", "e");
        System.out.println("Ingrese una frase de su comodidad: ");
        String fraseEntrada = datoEntrada.nextLine();
        System.out.println(fraseModificada.toUpperCase()+" "+fraseEntrada.toUpperCase());

    }
}
