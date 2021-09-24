package br.com.zup.listamodelagemclasses.pessoa;

public class Main {
    public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Jorge", 21,1.75);

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Peso: " + pessoa.peso);
        System.out.println("Altura: " + pessoa.altura);

        pessoa.peso = 1.75;
        System.out.println("------------------------------------------");

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Peso: " + pessoa.peso);
        System.out.println("Altura: " + pessoa.altura);



    }
}
