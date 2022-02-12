package com.sofka.Ejercicio_15;

import jdk.jfr.events.ExceptionThrownEvent;

import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {
        int dato=0;
        Scanner datoEntrada = new Scanner(System.in);
        do {
            try {
                System.out.println("******GESTION CINEMATOGRAFICA ******" +
                        "\n"+  "1-NUEVO ACTOR" +
                        "\n"+  "2-BUSCAR ACTOR"+
                        "\n"+  "3-ELIMINAR ACTOR"+
                        "\n"+  "4-MODIFICAR ACTOR"+
                        "\n"+  "5-VER TODOS LOS ACTORES"+
                        "\n"+  "6-VER PELICULAS DE LOS ACTORES"+
                        "\n"+  "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES"+
                        "\n"+  "8-SALIR"+
                        "\n"+  "***************** // *****************");
                System.out.println("Ingresar una opcion del menú");
                dato = datoEntrada.nextInt();
                switch (dato){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("OPCIÓN INCORRECTA");
                        break;
                }
            }catch (Exception e){
                System.out.println("Error: la Opcion ingresada es incorrecta"+e);
            }

        }while (dato !=8);

    }
}
