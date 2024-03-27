package Viagem;

public class Viagem {
    String destino;

    double distancia;
    double precoCombustivel;
    double autonomia;

    public void gastoViagem(){
        double litros = this.distancia/this.autonomia;
        double total = litros * this.precoCombustivel;
        System.out.println("Valor da viagem: " + total + "R$");
    }
}
