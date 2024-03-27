package Pessoas;

import java.util.Scanner;

public class chama {

    public static void main(String[] Args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String nome = leia.next();
        System.out.println("Informe a idade: ");
        int idade = leia.nextInt();
        System.out.println("Informe o cpf: ");
        String cpf = leia.next();
        Pessoa pessoa1 = new Pessoa(nome,idade,cpf);
        System.out.println(pessoa1.toString());

    }
}
