package com.sofka.EjerciciosPracticosDel_1_al_14;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        Scanner datoEntrada = new Scanner(System.in);
        int valor = Integer.parseInt(datoEntrada.nextLine());
        int i = valor;
        for(i=valor; i<=1000;i=i+2)
            System.out.println(i);
            i++;
            if(i==999||i>1000){
                System.out.println(1000);
            }
        }
}
