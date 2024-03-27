package NewContaBancaria;

import ContaBancaria.ContaBancaria;
import Pessoas.Pessoa;

public class main {
    public static void main(String[] args) {
        int numero = 12345;
        Pessoa titular = null;
        titular.setNome("Mauricio");
        titular.setIdade(32);
        titular.setCpf("077779429-21");

        Conta conta1 = new Conta(numero,titular);
        System.out.println(conta1.toString());



    }

}

