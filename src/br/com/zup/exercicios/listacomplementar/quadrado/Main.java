package br.com.zup.exercicios.listacomplementar.quadrado;

public class Main {
    public static void main(String[] args) {
        Quadrado tela = new Quadrado(5);

        tela.mudaValorLado(7);
        System.out.println("Lado do Quadrado: " + tela.valorLado());
        System.out.println("Área do quadrado: " + tela.calculoArea());
    }
}
