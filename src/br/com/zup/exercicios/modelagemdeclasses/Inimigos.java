package br.com.zup.exercicios.modelagemdeclasses;

public class Inimigos {
    String nome;
    double vida;

    public Inimigos(){

    }

    public Inimigos(String nome, double vida) {
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

    public String trocarNome(String nome){
        return this.nome = nome;
    }

    public double receberDano(double dano){
        return dano;
    }

    public double exibirVida(){
        return vida;
    }
}
