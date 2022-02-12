package com.sofka.EjerciciosPracticosDel_1_al_14;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        Scanner datoEntrada = new Scanner(System.in);
        System.out.println("Ingrese una frase de su comodidad: ");
        String fraseEntrada = datoEntrada.nextLine();
        int espacio = fraseEntrada.length();
        for (int c = 0; c < espacio; c++){
            char fraseEntregada = fraseEntrada.toLowerCase().charAt(c);
            switch (fraseEntregada){
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Cantidad total de vocales: "+(a+e+i+o+u));
        System.out.println("Cantidad total a: "+a);
        System.out.println("Cantidad total e: "+e);
        System.out.println("Cantidad total i: "+i);
        System.out.println("Cantidad total o: "+o);
        System.out.println("Cantidad total u: "+u);
        System.out.println("El tamaño de la frase con espacios incluidos es: "+espacio);

    }
}
