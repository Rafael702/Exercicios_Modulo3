package br.com.zup.listamodelagemclasses.bola;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bola futebol = new Bola(70, "azul","Adidas", 30);

        System.out.println("A circuferência recomendável de uma bola de futebol é: " + futebol.circunferencia + "cm");
        System.out.println("A cor da minha bola de futebol é: " + futebol.cor);
        System.out.println("A melhor marca de bola de futebol é: " + futebol.marca);
        System.out.println("A velocidade de uma bola de futebol é de: " + futebol.velocidade);


    }
}

