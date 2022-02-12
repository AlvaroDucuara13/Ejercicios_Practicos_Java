package com.sofka.EjerciciosPracticosDel_1_al_15;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args)
    {
        Scanner datoEntrada = new Scanner(System.in);
        System.out.println("Ingrese dia de la semana: ");
        String dia = datoEntrada.next();
        switch(dia)
        {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("El dia "+dia.toUpperCase()+" es laboral.");
                break;
            case "sabado":
            case "domingo":
                System.out.println("El dia "+dia.toUpperCase()+" no es laboral.");
                break;
            default:
                System.out.println("Introduce un dia de la semana: ");
        }
    }
}

