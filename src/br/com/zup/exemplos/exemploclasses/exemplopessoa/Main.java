package br.com.zup.exemplos.exemploclasses.exemplopessoa;

public class Main {

    public static void main(String[] args) {
        Contato objeto_contato = new Contato("Rafa", "9999999", "rafa@rafa", "32427484309", 20);

        System.out.println("A hash do nosso objeto é: " + objeto_contato);
        System.out.println(objeto_contato.nome);
        System.out.println(objeto_contato.telefone);
        System.out.println(objeto_contato.email);
        System.out.println(objeto_contato.cpf);
        System.out.println(objeto_contato.idade);
    }
}
