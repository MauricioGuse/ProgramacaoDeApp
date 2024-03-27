package AnimalInterface;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.comer();
        cachorro.dormir();
        cachorro.definirRaca();

        System.out.println("****************************");


        Gato gato = new Gato();
        gato.brincar();
        gato.miar();
        gato.rosnar();
        gato.definirRaca();
    }
}
