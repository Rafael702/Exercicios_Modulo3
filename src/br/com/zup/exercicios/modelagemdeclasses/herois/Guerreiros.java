package br.com.zup.exercicios.modelagemdeclasses.herois;

public class Guerreiros extends Heroi{

    private double poderAtaque;

    public Guerreiros() {
    }

    public Guerreiros(String nome, double vida, double poderAtaque) {
        super(nome, vida);
        this.poderAtaque = poderAtaque;
    }

    public double aplicarDano(){
        return poderAtaque;
    }
}
