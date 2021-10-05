package br.com.zup.exercicios.abstracao.imobiliaria;

import java.util.Scanner;

public class Sistema {

    public static Scanner capturarDados(String mensagem){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        return sc;
    }

    public static Morador criarMorador(){
        String nome = capturarDados("Informe o nome do Morador: ").nextLine();
        String cpf = capturarDados("Informe o CPF do " + nome + ":").nextLine();

        Morador morador = new Morador(nome,cpf);
        return morador;
    }

}
