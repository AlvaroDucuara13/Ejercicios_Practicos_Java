package com.sofka.Ejercicio_17;

public class Television extends Electrodomestico{

    private int resolucionPulg;
    private boolean sintonizadorTDT;

    static final int resolucionDeft =20;
    static final boolean sintonizadorTDTDeft =false;

    //Constructores
    public Television() {
        super();
        this.resolucionPulg = resolucionDeft;
        this.sintonizadorTDT = sintonizadorTDTDeft;
    }

    public Television(double precioBase, int peso) {
        super(precioBase, peso);
        this.resolucionPulg = resolucionDeft;
        this.sintonizadorTDT = sintonizadorTDTDeft;
    }

    // Herencia de atrubitos y metodos de la clase padre Electrodomestico en constructor
    public Television(double precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucionPulg = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //getters
    public int getResolucionPulg() {
        return resolucionPulg;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }


    @Override
    public double precioFinal()
    {
        double precioTemp = super.precioFinal();
        if (getResolucionPulg() > 40)
        {
            precioTemp = precioTemp + precioTemp * 0.30;
        }
        if (isSintonizadorTDT())
        {
            precioTemp = precioTemp + 250000;
        }
        return precioTemp;
    }
}
