package br.com.zup.listamodelagemclasses.conta;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("112345-09", "Jhony Bordy");

        System.out.println("Dia 29 - 11h00m00s PM");
        System.out.println("Número da Conta: " + cc1.numeroDaConta);
        System.out.println("Nome do Titular da Conta Corrente: " + cc1.nomeDoTitular);
        System.out.println("Saldo da Conta: " + cc1.saldo);

        cc1.saldo = 1_000;
        System.out.println("---------------------------------------------------------------");

        System.out.println("Dia 30 - 11h00m00s AM");
        System.out.println("Número da Conta: " + cc1.numeroDaConta);
        System.out.println("Nome do Titular da Conta Corrente: " + cc1.nomeDoTitular);
        System.out.println("Saldo da Conta: " + cc1.saldo);


    }
}
