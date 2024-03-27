package AnimalInterface;

import java.util.Scanner;

public class Gato implements Animal{
    Scanner leia = new Scanner(System.in);

    private String raca;

    @Override
    public void comer() {
        System.out.println("Comendo");

    }
    @Override
    public void dormir() {
        System.out.println("Dormindo");

    }

    @Override
    public void emitirSom() {

    }

    @Override
    public  void miar(){
        System.out.println("MiauMiau");
    }
    @Override
    public  void rosnar(){
        System.out.println("Rosnando");
    }
    @Override
    public void brincar(){
        System.out.println("Brincando");
    }

    @Override
    public void definirRaca() {
        System.out.println("Insira a raça do animal: ");
        raca = leia.next();

    }
}
