package br.com.zup.exemplos.encapsulamento.exemplo2;

public class Heroi {
    private String nome;
    private String protecao;
    private String vida;

    public Heroi(String nome, String protecao, String vida) {
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

    public String getVida() {
        return vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }
}
