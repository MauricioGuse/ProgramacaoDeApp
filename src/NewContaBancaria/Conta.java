package NewContaBancaria;

import Pessoas.Pessoa;

public class Conta {
    private int numeroConta;
    private double saldo;
    private Pessoa titular; //titular.nome titular.cpf titular.idade.

    public Conta(int numeroConta, Pessoa titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Novo saldo: " + this.saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                ", titular=" + titular +
                '}';
    }

    public void sacar(double valor){
        if (saldo>0 && saldo >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("Novo saldo: " + this.saldo);
            System.out.println("Saque Efetuado com sucesso!");
        }else{
            System.out.println("Saldo Insuficiente." + this.saldo);
        }


    }
}
