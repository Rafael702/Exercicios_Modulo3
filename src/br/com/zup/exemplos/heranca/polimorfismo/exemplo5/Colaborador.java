package br.com.zup.exemplos.heranca.polimorfismo.exemplo5;

public class Colaborador {
    private String nome;
    private double imposto;
    private double salario;

    public Colaborador() {

    }

    public Colaborador(String nome, double imposto, double salario) {
        this.nome = nome;
        this.imposto = imposto;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario() {
        double salarioLiquido = salario - imposto;
        return salarioLiquido;
    }
}
