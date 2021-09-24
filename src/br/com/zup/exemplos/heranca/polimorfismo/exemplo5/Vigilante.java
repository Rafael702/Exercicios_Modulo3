package br.com.zup.exemplos.heranca.polimorfismo.exemplo5;

public class Vigilante extends Colaborador{
    private double adicionalNoturno;
    private double ajudaDeCusto;

    public Vigilante(){

    }

    public Vigilante(double adicionalNoturno, double ajudaDeCusto) {
        this.adicionalNoturno = adicionalNoturno;
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Vigilante(String nome, double imposto, double salario, double adicionalNoturno, double ajudaDeCusto) {
        super(nome, imposto, salario);
        this.adicionalNoturno = adicionalNoturno;
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario(){
        double salarioLiquido = (getSalario() - getImposto()) + adicionalNoturno + ajudaDeCusto ;
        return salarioLiquido;
    }
}
