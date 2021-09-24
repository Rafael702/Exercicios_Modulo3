package br.com.zup.exemplos.encapsulamento.exemplo2;

public class Inimigos {
    private String nome;
    private String cor;
    private String tipoDeAtaque;
    private int vida;

    public Inimigos(String nome, String cor, String tipoDeAtaque, int vida) {
        this.nome = nome;
        this.cor = cor;
        this.tipoDeAtaque = tipoDeAtaque;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoDeAtaque() {
        return tipoDeAtaque;
    }

    public void setTipoDeAtaque(String tipoDeAtaque) {
        this.tipoDeAtaque = tipoDeAtaque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
