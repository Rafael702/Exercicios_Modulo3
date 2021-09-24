package br.com.zup.exemplos.encapsulamento.exemplo1;

public class Funcionario {
    private String nome;
    private double salario;
    private  String ctps;
    private String cpf;

    public Funcionario(String nome, double salario, String ctps, String cpf) {
        this.nome = nome;
        this.salario = salario;
        this.ctps = ctps;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
