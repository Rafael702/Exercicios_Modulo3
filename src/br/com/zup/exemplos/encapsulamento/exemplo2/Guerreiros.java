package br.com.zup.exemplos.encapsulamento.exemplo2;

public class Guerreiros extends Herois {
    private String arma;
    private int dano = 400;

    public Guerreiros(String nome, String protecao, int vida, String arma) {
        super(nome, protecao, vida);
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void perderVida(int dano){
        int aplicaDano = this.getVida() - dano;
        this.setVida(aplicaDano);
    }

    public int aplicaDano(){
        return dano;
    }
}
