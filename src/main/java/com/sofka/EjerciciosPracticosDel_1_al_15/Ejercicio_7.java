package com.sofka.EjerciciosPracticosDel_1_al_15;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner datoEntrada = new Scanner(System.in);
        System.out.println("Comparar si el número que registro es mayor o igual que cero");
        double valor = 0;
       do {
           System.out.println("Ingrese un número mayor o igual a cero");
            valor = Double.parseDouble(datoEntrada.nextLine());
       }while(valor!=0 && valor<0);
       if (valor > 0){System.out.println("El número es: "+valor);}
       else if(valor ==0){System.out.println("El número es: "+valor);}



    }
}
