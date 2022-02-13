package com.sofka.Ejercicio_18;

public class Serie implements Entregable{

    private String titulo;
    private int numTemporadas;
    private boolean entregado;
    private  String genero;
    private  String creador;

    static final int temporadasDeft =3;
    static final boolean entregadoDeft = false;

    //Constructores
    public Serie(){
        this.numTemporadas = temporadasDeft;
        this.entregado= entregadoDeft;
        this.titulo="";
        this.genero="";
        this.creador="";
    }
    public Serie(String titulo, String creador){
        this.numTemporadas = temporadasDeft;
        this.entregado= entregadoDeft;
        this.titulo=titulo;
        this.creador=creador;
        this.genero="";
    }

    public Serie(String titulo, String genero, String creador, int temporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.numTemporadas = temporadas;
        this.entregado=false;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    //ToString
    @Override
    public String toString() {
        return "\ntitulo= '" + titulo + '\'' +
                "\n numTemporadas= '" + numTemporadas + '\'' +
                "\n entregado= '" + entregado + '\'' +
                "\n genero= '" + genero + '\'' +
                "\n creador= '" + creador;
    }


    @Override
    public void entregar() {
        this.entregado=true;
    }

    @Override
    public void devolver() {
        this.entregado=false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    /*retorna 1 la serie con más números de temporadas.
    retorna 0 si las series tienen el mismo número de temporadas
    retorna -1 la serie con menor número de temporadas*/
    @Override
    public int compararSVJ(Object x) {
        int indice=-1;
        Serie serie= (Serie) x;
        if (this.numTemporadas >serie.getNumTemporadas()){
            indice=1;
        }
        else if(this.numTemporadas ==serie.getNumTemporadas()){
            indice=0;
        }
        return indice;
    }
}