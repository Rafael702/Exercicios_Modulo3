package br.com.zup.exercicios.listacomplementar.retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo(7, 9);

        System.out.println("Mudar Lado.");

        System.out.println("Digite 1: Para Mudar a Base do Retângulo");
        System.out.println("Digite 2: Para Mudar a Altura do Retângulo");
        System.out.println("Digite 3: Para Mudar a Base e a Altura do Retângulo");
        int opcao = sc.nextInt();

        System.out.println("Digite  o valor do lado:");
        double valorLado = sc.nextDouble();

        retangulo.mudarValorDosLados(valorLado, opcao);

        retangulo.valorDosLados();

        retangulo.calculoAreaEPerimetro();

    }
}
