package br.com.zup.exemplos.polimorfismo.exemplo1;

public class Figurante extends Ator {
    private int ingressosGratis = 10;

    public Figurante(String nome, String papel, double salario, double imposto) {
        super(nome, papel, salario, imposto);
    }

    public Figurante(String nome, String papel, double salario, double imposto, int ingressosGratis) {
        super(nome, papel, salario, imposto);
        this.ingressosGratis = ingressosGratis;
    }

    public int getIngressosGratis() {
        return ingressosGratis;
    }

    public void setIngressosGratis(int ingressosGratis) {
        this.ingressosGratis = ingressosGratis;
    }
}
