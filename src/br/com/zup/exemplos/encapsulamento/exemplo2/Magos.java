package br.com.zup.exemplos.encapsulamento.exemplo2;

public class Magos extends Herois {
    private String magia;

    public Magos(String nome, String protecao, int vida, String magia) {
        super(nome, protecao, vida);
        this.magia = magia;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }
}
