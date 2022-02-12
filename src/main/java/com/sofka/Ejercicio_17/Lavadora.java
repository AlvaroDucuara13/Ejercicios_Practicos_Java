package com.sofka.Ejercicio_17;

public class Lavadora extends Electrodomestico {

    private int carga;

    static final int CargaDeft = 5;

    //constructores
    public Lavadora() {
        super();
        this.carga = CargaDeft;
    }

    public Lavadora(double precioBase, int peso) {
        super(precioBase, peso);
        this.carga = CargaDeft;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    //getter
    public int getCarga() {
        return carga;
    }

    //Metodo propuesto por el ejercicio
    @Override
    public double precioFinal() {
        if (getCarga() > 30)
        {
            return super.precioFinal() + 50;
        }
        return super.precioFinal();
    }
}