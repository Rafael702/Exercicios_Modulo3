package br.com.zup.exemplos.encapsulamento.exemplo2;

public class Voadores extends Inimigos{
    private double velocidadeDeVoo;
    private int dano = 20;

    public Voadores(String nome, String cor, String tipoDeAtaque, int vida, double velocidadeDeVoo) {
        super(nome, cor, tipoDeAtaque, vida);
        this.velocidadeDeVoo = velocidadeDeVoo;
    }

    public double getVelocidadeDeVoo() {
        return velocidadeDeVoo;
    }

    public void setVelocidadeDeVoo(double velocidadeDeVoo) {
        this.velocidadeDeVoo = velocidadeDeVoo;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int aplicaDano(){
        return dano;
    }

    public void perderVida(int dano){
        int aplicaDano = this.getVida() - dano;
        setVida(aplicaDano);
    }


}
