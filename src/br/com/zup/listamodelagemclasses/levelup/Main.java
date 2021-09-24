package br.com.zup.listamodelagemclasses.levelup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pais> continente = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Pais pais1 = new Pais("Brasil", 8.516, 213);
        Pais pais2 = new Pais("Argentina", 2.780, 44.94);
        Pais pais3 = new Pais("Suécia", 450.295, 10.23);
        Pais pais4 = new Pais("Escócia", 77.910, 5.454);

        continente.add(pais1);
        continente.add(pais2);
        continente.add(pais3);
        continente.add(pais4);

        boolean menu = true;
        int opcao = 0;

        while (menu == true) {

            System.out.println("Digite 1: Para mostrar a Lista de Países");
            System.out.println("Digite 2: Para sair do Programa:");
            opcao = sc.nextInt();

            if (opcao == 1) {
                for (Pais mundo : continente) {
                    System.out.println("O nome do País é: " + mundo.nome);
                    System.out.println("A extensão territorial do País é: " + mundo.extensaoTerritorial + "km²");
                    System.out.println("A população do País é: " + mundo.populacao + " milhões");
                    System.out.println("--------------------------------------------------------------");
                }
            } else if (opcao == 2) {
                System.out.println("Agradeço por usar o programa!!!");
                menu = false;
            } else {
                System.out.println("Digite um valor válido, conforme consta nas opções do menu.");
            }
        }

    }
}
