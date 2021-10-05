package br.com.zup.exemplos.polimorfismo.exemplo1;

public class Ator {
    private String nome;
    private String papel;
    private double salario;
    private double imposto;

    public Ator(String nome) {
        this.nome = nome;
    }

    public Ator(double salario) {
        this.salario = salario;
    }

    public Ator(String nome, double salario){

    }

    public Ator(String nome, String papel, double salario, double imposto) {
        this.nome = nome;
        this.papel = papel;
        this.salario = salario;
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario(){
        double salarioLiquido = salario - imposto;
        return salarioLiquido;
    }
}
