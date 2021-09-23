package br.com.zup.exercicios.listamodelagemclasses3.exercicioclasses;

public class Administrador extends Colaborador{
    double ajudaDeCusto;

    public Administrador(){

    }

    public Administrador(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        double salarioLiquido = (getSalarioBase()- getImposto()) + ajudaDeCusto;
        return salarioLiquido;
    }
}
