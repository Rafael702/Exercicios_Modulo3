package br.com.zup.exercicios.listamodelagemclasses.contabancaria.conta;

public class ContaBancaria {
    String numeroConta;
    int saldo;
    String nomeCorrentista;

    public ContaBancaria(String numeroConta, int saldo, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nomeCorrentista = nomeCorrentista;
    }

    public void saque(int valor) {
        saldo -= valor;
    }

    public void deposito(int valor){
        saldo += valor;
    }

    public void extrato(){
        System.out.println("O Número da Conta é: " + numeroConta);
        System.out.println("O nome do correntista é: " + nomeCorrentista);
        System.out.println("O Saldo da Conta Corrente é: R$" + saldo);
    }

}
