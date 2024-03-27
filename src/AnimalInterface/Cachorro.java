package AnimalInterface;

import java.util.Scanner;

public class Cachorro  implements Animal{
    Scanner leia = new Scanner(System.in);

    private String raca;

    @Override
    public void comer() {
        System.out.println("Comendo");
    }
    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }

    @Override
    public void miar() {

    }

    @Override
    public void definirRaca() {
        System.out.println("Insira a raça do animal: ");
        raca = leia.next();

    }

    @Override
    public void rosnar() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void dormir() {
        System.out.println("Dormindo");
    }
}

