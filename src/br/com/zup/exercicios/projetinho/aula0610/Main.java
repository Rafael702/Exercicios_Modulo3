package br.com.zup.exercicios.projetinho.aula0610;

public class Main {
    public static void main(String[] args) {
    Consumidor consumidor = new Consumidor("Frederico","fred@fred");
    Fatura fatura = new Fatura(consumidor,800,"24/05/2021");

        System.out.println(fatura);
    }
}
