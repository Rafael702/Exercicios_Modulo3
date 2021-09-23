package br.com.zup.exercicios.modelagemdeclasses.herois;

public class Heroi {
    private String nome;
    private double vida;

    public Heroi() {

    }

    public Heroi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String trocarNome(String nome) {
        return this.nome = nome;
    }

    public double receberDano(double dano) {
        vida = vida - dano;
        return dano;
    }

    public double exibirVida(){
        if(vida > 0) {
            return vida;
        }else{
            return 0;
        }
    }
}
