package com.sofka.EjerciciosPracticosDel_1_al_14;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner datosEntrada = new Scanner(System.in);
        System.out.println("Hallar el precio con IVA de un producto"
                +"\n"+"Advertencia: los decimales no deben llevar comas, solo deben llevar puntos");
        System.out.println("Ingresar el valor del producto");
        String a = datosEntrada.nextLine();
        try {
            Double.parseDouble(a);
            double precio = Double.parseDouble(a);
            double precioIVA = precio * 0.21+precio;
            System.out.println("El precio del producto con iva es: "+precioIVA+ " pesos");

        }catch(NumberFormatException e) {
            System.out.println("ERROR: los decimales no deben llevar comas, solo deben llevar puntos");
        }




    }
}
