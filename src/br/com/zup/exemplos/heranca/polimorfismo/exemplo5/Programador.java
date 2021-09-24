package br.com.zup.exemplos.heranca.polimorfismo.exemplo5;

public class Programador extends Colaborador {
    private String linguagem;

    public Programador() {
    }

    public Programador(String nome, double imposto, double salario, String linguagem) {
        super(nome, imposto, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
