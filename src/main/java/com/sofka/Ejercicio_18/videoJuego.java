package com.sofka.Ejercicio_18;

public class videoJuego implements Entregable {


    private  String titulo;
    private  int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    static final int horasEstimDeft =10;
    static final boolean entregadoDeft = false;

    //constructores
    public videoJuego() {
        this.horasEstimadas= horasEstimDeft;
        this.entregado= entregadoDeft;
        this.titulo="";
        this.genero="";
        this.compania="";
    }

    public videoJuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.compania="";
        this.genero="";
        this.entregado= entregadoDeft;
    }

    public videoJuego(String titulo, String genero, String compania, int horasEstimadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;
        this.horasEstimadas = horasEstimadas;
        this.entregado= entregadoDeft;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    //ToString

    @Override
    public String toString() {
        return "\ntitulo= '" + titulo + '\'' +
                "\n horasEstimadas= '" + horasEstimadas +'\'' +
                "\n entregado= '" + entregado +'\'' +
                "\n genero= '" + genero + '\'' +
                "\n compania= '" + compania;
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

    /*retorna 1 el video juego con más números de horas.
    retorna 0 si los video juegos tienen el mismo número de horas
    retorna -1 el video juego con menor número de horas*/
    @Override
    public int compararSVJ(Object x) {
        int indice=-1;
        videoJuego videoJuego= (videoJuego) x;
        if (this.horasEstimadas>videoJuego.horasEstimadas){
            indice=1;
        }else if(this.horasEstimadas==videoJuego.getHorasEstimadas()){
            indice=0;
        }
        return indice;
    }


}
