package br.com.zup.exercicios.exerciciolevelup;

public class Morador {
    private String nome;
    private String cpf;


    public Morador() {

    }

    public Morador(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        StringBuilder retornor = new StringBuilder();
        retornor.append(": " + nome);
        retornor.append(" | CPF: " + cpf);
        return retornor.toString();
    }
}
