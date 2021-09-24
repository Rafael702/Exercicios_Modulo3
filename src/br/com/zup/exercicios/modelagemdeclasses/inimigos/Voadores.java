package br.com.zup.exercicios.modelagemdeclasses.inimigos;

public class Voadores extends Inimigos{
    private double danoTiro;

    public Voadores() {

    }

    public Voadores(String nome, double vida, double danoTiro) {
        super(nome, vida);
        this.danoTiro = danoTiro;
    }

    public double getDanoTiro() {
        return danoTiro;
    }

    public void setDanoTiro(double danoTiro) {
        this.danoTiro = danoTiro;
    }

    public double aplicarDano(){
        return danoTiro;
    }
}
