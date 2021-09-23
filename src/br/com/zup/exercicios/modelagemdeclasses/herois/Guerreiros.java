package br.com.zup.exercicios.modelagemdeclasses.herois;

public class Guerreiros extends Heroi{

    private double poderAtaque;

    public Guerreiros(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public Guerreiros(String nome, double vida, double poderAtaque) {
        super(nome, vida);
        this.poderAtaque = poderAtaque;
    }

    private double aplicarDano(){
        return poderAtaque;
    }
}
