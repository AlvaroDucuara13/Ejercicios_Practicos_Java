package com.sofka.Ejercicio_17;
import java.util.Arrays;
import java.util.List;

public class Electrodomestico {

    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    static final double precioBaseDeft =100;
    static final int pesoDeft =5;
    static final String consumos = "ABCDEF";
    static final List<String> coloresDeft = Arrays.asList("blanco", "negro", "rojo", "azul", "gris");

    //Constructores
    public Electrodomestico() {
        this.color = comprobarColor(this.color);
        this.consumoEnergetico = comprobarConsumoEnergetico(this.consumoEnergetico);
        this.precioBase = precioBaseDeft;
        this.peso = pesoDeft;
    }


    public Electrodomestico(double precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = comprobarColor(this.color);
        this.consumoEnergetico = comprobarConsumoEnergetico(this.consumoEnergetico);
    }


    public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    //getters
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }


    //Metodos propuestos por el ejercicio
    private char comprobarConsumoEnergetico(char letra) {
        String verificar = String.valueOf(letra);
        verificar = verificar.toUpperCase();
        if (consumos.contains(verificar)) {
            return verificar.charAt(0);
        }
        return 'F';
    }

    private String comprobarColor(String color) {
        final String[] ColorTemp = {
                "blanco"
        };
        coloresDeft.forEach(s -> {
                    if (s.equalsIgnoreCase(color)) {
                        ColorTemp[0] = color;
                    }
                }
        );
        return ColorTemp[0];
    }

    protected double precioConsumo() {
        char consumoTemp = getConsumoEnergetico();
        double precio = 0;
        switch (consumoTemp) {
            case 'A':
                precio = 100;
                break;
            case 'B':
                precio = 80;
                break;
            case 'C':
                precio = 60;
                break;
            case 'D':
                precio = 50;
                break;
            case 'E':
                precio = 30;
                break;
            case 'F':
                precio = 10;
                break;
            default:
                precio=0;
                break;
        }
        return  precio;
    }

    protected double precioTamano(){
        double precioTemp=0;
        int peso=getPeso();
        if(peso>=0 && peso<=19){
            precioTemp=10;
        }
        else if(peso>19 && peso<50){
            precioTemp=50;
        }
        else if(peso>49 && peso<80){
            precioTemp=80;
        }
        else if(precioTemp>80){
            precioTemp =100;
        }
        return precioTemp;
    }

    public double precioFinal() {
        return getPrecioBase()+ precioTamano()+ precioConsumo();
    }
}
