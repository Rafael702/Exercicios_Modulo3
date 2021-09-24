package br.com.zup.exercicios.listacomplementar.bola;

public class Jabulane extends Bola{
    String nome;

    public Jabulane(String cor, double circunferencia, String material, String nome) {
        super(cor, circunferencia, material);
        this.nome = nome;
    }

    @Override
    public void mostrarCor(){
        System.out.println("A cor da " + nome + " é: " + cor);
    }
}
