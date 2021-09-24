package br.com.zup.exemplos.exemploclasses.exemplopessoa;

public class Contato {
    String nome;
    String telefone;
    String cpf;
    String email;
    int idade;

    public Contato(String nome, String telefone, String cpf, String email, int idade){
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
    }

    @Override
    public String toString(){
        return this.nome + this.email + this.telefone + this.idade;
    }
}
