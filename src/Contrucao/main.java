package Contrucao;

import Pessoas.Pessoa;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        pessoa pessoa1 = new pessoa("Thor", 200);
        pessoa1.setNome("Gilberto");
        System.out.println("Iforme o nome da pessoa: " + pessoa1.getNome());
        System.out.println("Informe a idade: " + pessoa1.getIdade());
        System.out.println("Digite o novo nome:" );
        String novoNome = leia.next();
        pessoa1.setNome(novoNome);
        System.out.println("Nome atualizado: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade() );
    }
}
