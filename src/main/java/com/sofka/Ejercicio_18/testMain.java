package com.sofka.Ejercicio_18;

public class testMain {
    public static void main(String[] args) {


        videoJuego Videojuego_1 = new videoJuego("Mortal Kombat",5);
        videoJuego Videojuego_2 = new videoJuego("Pes2018","Estrategia","Konami",2);
        videoJuego Videojuego_3 = new videoJuego("Far cry 4","Aventura","Ubisoft",16);
        videoJuego Videojuego_4 = new videoJuego("Gears Of War",9);
        videoJuego Videojuego_5 = new videoJuego();

        Serie serie_1 = new Serie("Dexte","James Manos Jr");
        Serie serie_2 = new Serie("Expediente X ","Suspenso", "Chris Carter.", 11);
        Serie serie_3 = new Serie("American Horror Story","Terror", "Ryan Murphy", 10);
        Serie serie_4 = new Serie("Friends","David Crane");
        Serie serie_5 = new Serie();


        videoJuego[] videoJuegos={Videojuego_5, Videojuego_1, Videojuego_2, Videojuego_3, Videojuego_4};
        Serie[] series ={serie_5, serie_1, serie_2, serie_3, serie_4};

        videoJuegos[2].entregar();
        videoJuegos[1].entregar();
        videoJuegos[4].entregar();
        series[2].entregar();
        series[1].entregar();
        series[4].entregar();

        int numEntregados=0;
        for (Serie s: series) {
            if (s.isEntregado()){
                numEntregados+=1;
                s.devolver();
            }
        }
        for (videoJuego v: videoJuegos) {
            if (v.isEntregado()){
                numEntregados+=1;
                v.devolver();
            }
        }
        System.out.println("Se encuentran "+numEntregados +" video juegos y series entregados\n\t");

        videoJuego masHoras = videoJuegos[0];
        Serie masTemporadas = series[0];

        for (int i = 1; i < videoJuegos.length; i++) {
            if (videoJuegos[i].compararSVJ(masHoras)==1){
                masHoras=videoJuegos[i];
            }
            if (series[i].compararSVJ(masTemporadas)==1){
                masTemporadas=series[i];
            }
        }

        System.out.println("El video juego que contiene más horas de jugabilidad es: "+masHoras.toString());
        System.out.println("\n\rLa serie que contiene más temporadas es: "+masTemporadas.toString());
    }
}
