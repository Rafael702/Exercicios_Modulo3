package br.com.zup.exercicios.listamodelagemclasses.carro;

public class Carro {
    String nome;
    String peso;
    String fabricante;
    String cor;
    double valorDoCarro;

    public Carro(String nome, String peso, String fabricante, String cor, double valorDoCarro){
        this.nome = nome;
        this.peso = peso;
        this.fabricante = fabricante;
        this.cor = cor;
        this.valorDoCarro = valorDoCarro;
    }

    public void darDesconto(double valorDesconto){
        valorDoCarro = valorDoCarro - valorDesconto;
    }

    public void pintar(String novaCor){
        cor = novaCor;
    }


}
