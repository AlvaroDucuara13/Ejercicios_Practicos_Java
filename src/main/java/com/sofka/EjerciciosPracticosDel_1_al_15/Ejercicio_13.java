package com.sofka.EjerciciosPracticosDel_1_al_15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio_13 {
    public static void main(String[] args) {
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("El formato de la fecha y hora (AAAA/MM/DD) (HH:MM:SS) son: ");
        System.out.println("yyyy/MM/dd HH:mm:ss-> "+fecha.format(LocalDateTime.now()));
    }
}
