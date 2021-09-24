package br.com.zup.exercicios.listacomplementar.bola;

public class Jabulani extends Bola{
    String nome;

    public Jabulani(String cor, double circunferencia, String material, String nome) {
        super(cor, circunferencia, material);
        this.nome = nome;
    }

    @Override
    public void mostrarCor(){
        System.out.println("A cor da " + nome + " é: " + cor);
    }
}
