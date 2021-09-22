package br.com.zup.exemplos.exemploclasses.pessoa;


import br.com.zup.exemplos.exemploclasses.pessoa.pessoaPrivada.Data;
import br.com.zup.exemplos.exemploclasses.pessoa.pessoaPrivada.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        String nome = sc.next();

        System.out.println("Digite a sua data de nascimento");
        System.out.println("Dia:");
        int dia = sc.nextInt();

        System.out.println("Mês:");
        int mes = sc.nextInt();

        System.out.println("Ano:");
        int ano = sc.nextInt();

        System.out.println("Digite a sua altura:");
        double altura = sc.nextDouble();
        Data dataNascimento = new Data(dia, mes, ano);


        Pessoa pessoinha = new Pessoa(nome, dataNascimento,altura);
        pessoinha.calcularIdade();
        pessoinha.imprimirDados();
    }
}
