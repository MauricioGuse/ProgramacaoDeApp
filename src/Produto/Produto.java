package Produto;

public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    public double valorEstoque(){
        return this.quantidadeEmEstoque * this.preco;
    }

}
