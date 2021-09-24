package br.com.zup.exemplos.encapsulamento.exemplo2;

public class Herois {
    private String nome;
    private String protecao;
    private int vida;

    public Herois(String nome, String protecao, int vida) {
        this.nome = nome;
        this.protecao = protecao;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProtecao() {
        return protecao;
    }

    public void setProtecao(String protecao) {
        this.protecao = protecao;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
