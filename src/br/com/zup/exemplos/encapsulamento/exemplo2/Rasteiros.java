package br.com.zup.exemplos.encapsulamento.exemplo2;

public class Rasteiros extends Inimigos {
    private double numeroDePernas;

    public Rasteiros(String nome, String cor, String tipoDeAtaque, int vida, double numeroDePernas) {
        super(nome, cor, tipoDeAtaque, vida);
        this.numeroDePernas = numeroDePernas;
    }

    public double getNumeroDePernas() {
        return numeroDePernas;
    }

    public void setNumeroDePernas(double numeroDePernas) {
        this.numeroDePernas = numeroDePernas;
    }
}
