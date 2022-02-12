package com.sofka.Ejercicio_17;

public class testMain {
    public static void main(String[] args)
    {


        Electrodomestico Nevera = new Electrodomestico();
        Electrodomestico FreidoraAire = new Electrodomestico(230,2);
        Electrodomestico Estufa = new Electrodomestico(412,"blanco",'d',4);
        Electrodomestico Sandwichera = new Electrodomestico(50,1);
        Electrodomestico Estractor = new Electrodomestico(623,"gris",'c',7);


        Lavadora LavadoraLg = new Lavadora();
        Lavadora LavadoraMabe = new Lavadora(1300,8);
        Lavadora LavadoraSamsung = new Lavadora(4500,"blanca",'A',13,28);

        Television TelevisorLg = new Television();
        Television TelevisorSamsung = new Television(9300,16);
        Television TelevisorApple = new Television(10345,"rojo",'F',21,81,true);


        Electrodomestico [] Electrodomesticos = {
                        Nevera,
                        FreidoraAire,
                        Estufa,
                        Sandwichera,
                        Estractor,
                        LavadoraLg,
                        LavadoraMabe,
                        LavadoraSamsung,
                        TelevisorLg,
                        TelevisorSamsung,
                        TelevisorApple,
                };

        double precioElcetrTotal=0;
        double precioLavadrTotal=0;
        double precioTvTotal=0;
        for (Electrodomestico e: Electrodomesticos) {
            if(e instanceof Electrodomestico ){
                precioElcetrTotal = precioElcetrTotal + e.precioFinal();
            }
            if (e instanceof  Lavadora){
                precioLavadrTotal = precioLavadrTotal + e.precioFinal();
            }
            if(e instanceof Television){
                precioTvTotal = precioTvTotal + e.precioFinal();
            }
        }
        double total=precioElcetrTotal+precioLavadrTotal+precioTvTotal;
        System.out.println("Los Electrodomesticos sin lavadoras y sin televisores, tienen un precio total de: "+precioElcetrTotal+" Euros.");
        System.out.println("Las lavadoras tienen un precio total de: "+precioLavadrTotal+" Euros.");
        System.out.println("Los Televisores tienen un precio total de: "+precioTvTotal+" Euros.");
        System.out.println("El precio total de todo los objetos es: "+total+" Euros.");
    }
}
