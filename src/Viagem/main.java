package Viagem;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Viagem viagem = new Viagem();
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o destino:");
        viagem.destino = leia.next();
        System.out.println("Informe a distancia:");
        viagem.distancia = leia.nextDouble();
        System.out.println("Informe o preço do combustivel:");
        viagem.precoCombustivel = leia.nextDouble();
        System.out.println("Informe a autonomia do veiculo:");
        viagem.autonomia = leia.nextDouble();
        viagem.gastoViagem();


    }
}
