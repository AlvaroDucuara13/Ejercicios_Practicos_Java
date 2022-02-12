package com.sofka.Ejercicio_16;

import jdk.nashorn.internal.ir.ReturnNode;

import java.security.PublicKey;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TestPersona {

    public static void main(String[] args) {
        Scanner datoEntrada = new Scanner(System.in);
        //Datos de la primera persona
        System.out.println("Digite el nombre de la persona_1");
        String nombre_1 = datoEntrada.next();

        System.out.println("Digite la edad de la persona_1");
        int edadPersona_1 = datoEntrada.nextInt();
        while (edadPersona_1<1){
            System.out.println("Edad Inválida "+"\n"+"Digite una edad válida");
            edadPersona_1=datoEntrada.nextInt();
        }

       System.out.println("Digite el sexo de la persona_1 \"H\" hombre y \"M\" mujer: ");
        char sexo_1 = datoEntrada.next().charAt(0);
        String s =  String.valueOf(sexo_1).toUpperCase();

        System.out.println("Digite el peso de la persona_1 en Kg");
        int peso_1 = datoEntrada.nextInt();
        while (peso_1 <8){
            System.out.println("Peso inválido"+"\n"+"Digite un peso válido en Kg");
            peso_1 = datoEntrada.nextInt();
        }

        System.out.println("Digite la altura de la persona_1 en metros: ");
        String datoModificar1 = datoEntrada.next();
        datoModificar1 = datoModificar1.replace(",", ".");
        float altura_1 = Float.parseFloat(datoModificar1);
        while (altura_1 < 0.67)
        {
            System.out.println("Altura inválida"+"\n"+"Digite la altura de la persona_1 en metros: ");
            altura_1 = datoEntrada.nextFloat();
        }

        System.out.println("_________________________________________________________");
        //Datos de la segunda persona
        System.out.println("Digite el nombre de la persona_2");
        String nombre_2 = datoEntrada.next();

        System.out.println("Digite la edad de la persona_2");
        int edadPersona_2 = datoEntrada.nextInt();
        while (edadPersona_2<1){
            System.out.println("Edad Inválida "+"\n"+"Digite una edad válida");
            edadPersona_2=datoEntrada.nextInt();
        }

        System.out.println("Digite el sexo de la persona_2 \"H\" hombre y \"M\" mujer: ");
        char sexo_2 = datoEntrada.next().charAt(0);
        String s2 =  String.valueOf(sexo_2).toUpperCase();

        System.out.println("Digite el peso de la persona_2 en Kg");
        int peso_2 = datoEntrada.nextInt();
        while (peso_2 <8){
            System.out.println("Peso inválido"+"\n"+"Digite un peso válido en Kg");
            peso_2 = datoEntrada.nextInt();
        }

        System.out.println("Digite la altura de la persona_2 en metros: ");
        String datoModificar2 = datoEntrada.next();
        datoModificar2 = datoModificar2.replace(",", ".");
        float altura_2 = Float.parseFloat(datoModificar2);
        while (altura_2 < 0.67)
        {
            System.out.println("Altura inválida"+"\n"+"Digite la altura de la persona_2 en metros: ");
            altura_2 = datoEntrada.nextFloat();
        }

        System.out.println("_________________________________________________________");
        //Datos de la tercera persona
        System.out.println("Digite el nombre de la persona_3");
        String nombre_3 = datoEntrada.next();

        System.out.println("Digite la edad de la persona_3");
        int edadPersona_3 = datoEntrada.nextInt();
        while (edadPersona_3<1){
            System.out.println("Edad Inválida "+"\n"+"Digite una edad válida");
            edadPersona_3=datoEntrada.nextInt();
        }

        System.out.println("Digite el sexo de la persona_3 \"H\" hombre y \"M\" mujer: ");
        char sexo_3 = datoEntrada.next().charAt(0);
        String s3 =  String.valueOf(sexo_3).toUpperCase();

        System.out.println("Digite el peso de la persona_3 en Kg");
        int peso_3 = datoEntrada.nextInt();
        while (peso_3 <8){
            System.out.println("Peso inválido"+"\n"+"Digite un peso válido en Kg");
            peso_3 = datoEntrada.nextInt();
        }

        System.out.println("Digite la altura de la persona_3 en metros: ");
        String datoModificar3= datoEntrada.next();
        datoModificar3 = datoModificar3.replace(",", ".");
        float altura_3 = Float.parseFloat(datoModificar3);
        while (altura_3 < 0.67)
        {
            System.out.println("Altura inválida"+"\n"+"Digite la altura de la persona_3 en metros: ");
            altura_3 = datoEntrada.nextFloat();
        }


        //Instanciar los datos personales
        datosPersonales persona_1 = new datosPersonales(nombre_1,edadPersona_1,peso_1,altura_1,sexo_1);
        datosPersonales persona_2 = new datosPersonales(nombre_2, edadPersona_2,sexo_2);
        datosPersonales persona_3 = new datosPersonales();

        //otorgar valores a los atributos de la persona_2
        persona_2.setPeso(peso_2);
        persona_2.setEstatura(altura_2);
        persona_2.setSexo(sexo_2);

        //otorgar valores a los atributos de la persona_3
        persona_3.setNombrePersona(nombre_3);
        persona_3.setEdad(edadPersona_3);
        persona_3.setPeso(peso_3);
        persona_3.setEstatura(altura_3);
        persona_3.setSexo(sexo_3);


        //verificación personas mayores de edad o menores de edad
        boolean mayorEdad = true;
        mayorEdad = persona_1.esMayorDeEdad();
        if (mayorEdad){
            System.out.println("Persona_1 si es mayor de edad");
        }
        mayorEdad = persona_2.esMayorDeEdad();
        if (mayorEdad){
            System.out.println("Persona_2 si es mayor de edad");
        }
        mayorEdad = persona_3.esMayorDeEdad();
        if (mayorEdad){
            System.out.println("Persona_3 si es mayor de edad");
        }

            //Verificación del peso de cada persona
        int intervaloPeso =0;
        intervaloPeso = persona_1.calcularIMC();
        System.out.println("persona_1 -> "+verificarPeso(intervaloPeso));
        intervaloPeso=persona_2.calcularIMC();
        System.out.println("persona_2 -> "+verificarPeso(intervaloPeso));
        intervaloPeso = persona_3.calcularIMC();
        System.out.println("persona_3 -> "+verificarPeso(intervaloPeso));

        //Datos generales de las personas
        System.out.println(persona_1.toString());
        System.out.println(persona_2.toString());
        System.out.println(persona_3.toString());

    }

    //comprobación estado del peso
    public static String verificarPeso(int indice){
        String m ="";

        if (indice == -1){
            m = "Persona mantiene su peso ideal";
        }
        else if (indice == 0){
            m = "Persona mantiene su peso por debajo del peso ideal";
        }
        else {
            m = "Persona con sobrepeso";
        }
        return m;
    }
}
