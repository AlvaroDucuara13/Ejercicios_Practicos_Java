package com.sofka.EjerciciosPracticos;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner datosEntrada = new Scanner(System.in);
        System.out.println("Ingresa el primer dato numérico a comparar: ");
        //Se guarda el dato de entrada en una variable entera a
        int a = Integer.parseInt(datosEntrada.nextLine());
        System.out.println("Ingresa el segundo dato numérico a comparar: ");
        //Se guarda el dato de entrada en una variable entera b
        int b = Integer.parseInt(datosEntrada.nextLine());
        //se compara los datos numéricos de entrada.
        if (a > b){
            System.out.println("El primer dato numérico es mayor que el segundo dato numérico");
        }
        else if (a < b){
            System.out.println("El primer dato numérico es menor que el segundo dato numérico");
        }
        else {
            System.out.println("los datos numéricos son iguales");
        }
    }

}
