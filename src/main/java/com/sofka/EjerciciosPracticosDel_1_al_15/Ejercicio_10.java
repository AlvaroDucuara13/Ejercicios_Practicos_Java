package com.sofka.EjerciciosPracticosDel_1_al_15;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner datoEntrada = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String fraseEntrada = datoEntrada.nextLine();
        String fraseModificada = fraseEntrada.replace(" ", "");
        System.out.println(fraseModificada);
    }

}
