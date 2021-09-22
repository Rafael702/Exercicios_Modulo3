package br.com.zup.exercicios.listamodelagemclasses.contabancaria;

import br.com.zup.exercicios.listamodelagemclasses.contabancaria.conta.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria objeto = new ContaBancaria("8892-1",5,"Roberto da Silva");

        objeto.extrato();
        objeto.deposito(1_000);
        System.out.println("-------------------------------------------------");
        objeto.extrato();
        System.out.println("-------------------------------------------------");
        objeto.saque(500);
        objeto.extrato();


    }
}
