package com.sofka.EjerciciosPracticos;

import javax.swing.*;
import java.util.ArrayList;

public class Ejercicio_5 {

    public static void main(String[] args) {
        int i=1;

        while (i <= 100){
            i++;

            if (i %2 !=0){
                System.out.println("Número Impar: "+i);
            }
            else{
                System.out.println("Número par: "+i);
            }

        }
    }
}
