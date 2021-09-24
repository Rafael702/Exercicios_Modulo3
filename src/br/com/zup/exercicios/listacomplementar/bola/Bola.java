package br.com.zup.exercicios.listacomplementar.bola;

public class Bola {
    String nome;
    String cor;
    double circunferencia;
    String material;

    public void trocarCor(String nomeCor){
        this.cor = nomeCor;
    }

    public void mostrarCor(){
        System.out.println("A cor da " + nome + " é: " + cor);
    }
}
