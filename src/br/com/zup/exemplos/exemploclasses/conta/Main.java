package br.com.zup.exemplos.exemploclasses.conta;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("John", "1234567891-01","9972", "98765-1");

        conta.mostrarDados();
        conta.depositar(100);
        conta.mostrarDados();
        System.out.println("----------------------------------");
        conta.sacar(10);
        conta.mostrarDados();
        System.out.println("----------------------------------");





    }
}
