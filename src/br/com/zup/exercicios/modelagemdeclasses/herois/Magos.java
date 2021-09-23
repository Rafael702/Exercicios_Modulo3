package br.com.zup.exercicios.modelagemdeclasses.herois;

public class Magos extends Heroi{
    private double poderMagico;

    public Magos(double poderMagico) {
        this.poderMagico = poderMagico;
    }

    public Magos(String nome, double vida, double poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }

    public double getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }

    private double aplicarMagia(){
        return poderMagico;
    }
}
