package com.sofka.Ejercicio_16;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class datosPersonales {

    private  String nombrePersona;
    private char sexo;
    private int edad;
    private float altura;
    private int peso;
    private String DNI;

    Random ranChar = new Random();
    char letras = (char) (ranChar.nextInt(26)+'a');
    String LetrasMay = String.valueOf(letras);

    static  final char sexoDefault = 'H';

    public datosPersonales() {
        this.edad = 0;
        this.altura = 0;
        this.nombrePersona = "";
        this.peso = 0;
        this.sexo = comprobarSexo(this.sexo);
        generaDNI();
    }

    public datosPersonales(String nombre, int edad, char sexo) {
        this.nombrePersona = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.altura = 0;
        this.peso = 0;
        generaDNI();
    }

    public datosPersonales(String nombre, int edad, int peso, float altura, char sexo) {
        this.nombrePersona = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = comprobarSexo(sexo);
        generaDNI();
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(float altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public  int calcularIMC(){
        int c = 0;
        double IMC = (this.peso/Math.pow(this.altura, 2));
        if (IMC <20){
            c=-1;
        }
        else if (IMC >= 20 && IMC <= 25){
            c = 0;
        }
        else{
            c = 1;
        }
        //System.out.println(c);
        return c;
    }

    public boolean esMayorDeEdad(){
        if (this.edad <18){
            return  false;
        }
        else{
            return true;
        }
    }

    public char comprobarSexo(char sexo){
        char genero = sexoDefault;
        if ("M".equals(sexo)){
            genero = 'M';
        }
        return  genero;
    }

    @Override
    public String toString() {
        return "datos Personales: " +
                "nombre=' " + nombrePersona + '\'' +
                ", sexo= " + sexo +
                ", edad=" + edad +
                ", estatura (Altura Max)=" + altura +
                ", peso (Kg)= " + peso +
                ", DNI=' " + DNI ;
    }
    private void generaDNI(){
        int idDNI = (int) (100000000 * Math.random());
        this.DNI = idDNI + "_"+LetrasMay.toUpperCase();

    }
}
