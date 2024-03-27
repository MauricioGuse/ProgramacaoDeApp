package Produto;

public class main {
    public static void main(String[] args){
        Produto arroz = new Produto();
        arroz.nome = "Rampinelli";
        arroz.preco = 5;
        arroz.quantidadeEmEstoque = 8;
        System.out.println("Nome: " + arroz.nome);
        System.out.println("Preço: " + arroz.preco);
        System.out.println("Quantidade em estoque: " + arroz.valorEstoque());

    }
}
