package com.sofka.EjerciciosPracticosDel_1_al_15;

import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner datosEntrada = new Scanner(System.in);
        System.out.println("Comparación de palabras");
        System.out.println("Introduce la primera palabra: ");
        String palabra1 = datosEntrada.nextLine();
        System.out.println("Introduce la segunda palabra");
        String palabra2 = datosEntrada.nextLine();
        if (igualesPalabras(palabra1, palabra2)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println(palabras(palabra1, palabra2));
        }
    }

    public  static  String palabras(String palabra1, String palabra2){
        String r = "";

        if (palabra1.length() > palabra2.length()) {
            r=diferenciarPalabras(palabra1,palabra2);
        } else if (palabra2.length() < palabra2.length()) {
            r=diferenciarPalabras(palabra2,palabra1);
        }else {
            for (int i = 0; i < palabra1.length(); i++) {
                if (palabra1.charAt(i) != palabra2.charAt(i)) {
                    r =r + "La posicion "+i+" se encuentra la letra de la palabra 1: " + palabra1.charAt(i) + ", y no es igual a la letra " + palabra2.charAt(i)+" de la palabra 2.\n";
                }
            }
        }
        return r;
    }

    public static  String diferenciarPalabras(String palabra1, String palabra2){
        String r = "";
        for (int i =0; i < palabra1.length(); i++){
            if (i < palabra2.length()){
                if (palabra1.charAt(i) != palabra2.charAt(i)){
                    r = r + "La posición "+i+"se encuentra la letra de la palabra 1: "+palabra1.charAt(i)+" y no es igual a la letra "+palabra2.charAt(i)+"de la palabra 2\n";
                }
            }
            else{
                r = r + "La posición "+i+ "se encuentra la letra de la palabra 1 es: "+palabra1.charAt(i)+" y no se encuentra una letra para compararse en la palabra 2\n";
            }
        }
        return r;
    }
    public  static Boolean igualesPalabras(String palabra1, String palabra2){
        return  palabra1.equals(palabra2) ? true : false;
    }

}
