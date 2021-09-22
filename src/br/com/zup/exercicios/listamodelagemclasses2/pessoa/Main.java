package br.com.zup.exercicios.listamodelagemclasses2.pessoa;

import br.com.zup.exercicios.listamodelagemclasses2.pessoa.pessoaPrivada.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoinha = new Pessoa("Romeu","23-06-2001",1.75);

        pessoinha.imprimirDados();

    }
}
