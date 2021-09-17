package br.com.zup.listamodelagemclasses.bola;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informações de bolas de acordo com o esporte.");
        System.out.println("Escolha um esporte e te informarei a bola que eu tenho");
        System.out.println("1- Futebol| 2- Basquete | 3- Vôlei");
        int bola = sc.nextInt();

        if(bola == 1){
            Bola futebol = new Bola(70, "azul","Adidas", 30);

            System.out.println("A circuferência recomendável de uma bola de futebol é: " + futebol.circunferencia + "cm");
            System.out.println("A cor da minha bola de futebol é: " + futebol.cor);
            System.out.println("A melhor marca de bola de futebol é: " + futebol.marca);
            System.out.println("A velocidade de uma bola de futebol é de: " + futebol.velocidade + "m/s");
        }else if(bola == 2){
            Bola volei = new Bola(68.5, "azul","Mikasa VSO2000", 130);

            System.out.println("A circuferência recomendável de uma bola de vôlei é de: " + volei.circunferencia + "cm");
            System.out.println("A cor da minha bola de Vôlei é: " + volei.cor);
            System.out.println("A melhor marca de bola de Vôlei é: " + volei.marca);
            System.out.println("A velocidade de uma bola de Vôlei é de: " + volei.velocidade + "km/h");
        }else if(bola == 3){
            Bola basquete = new Bola(74.9, "laranja","SPALDING NBA", 7.08);

            System.out.println("A circuferência recomendável de uma bola de basquete é de: " + basquete.circunferencia + "cm");
            System.out.println("A cor da minha bola de basquete é: " + basquete.cor);
            System.out.println("A melhor marca de bola de basquete é: " + basquete.marca);
            System.out.println("A velocidade de uma bola de basquete é de: " + basquete.velocidade + "m/s");
        }else {
            System.out.println("Informe um valor válido, de acordo com a lista de opções.");
        }

    }
}

