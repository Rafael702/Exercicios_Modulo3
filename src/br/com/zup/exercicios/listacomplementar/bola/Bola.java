package br.com.zup.exercicios.listacomplementar.bola;

public class Bola {
    String cor;
    double circunferencia;
    String material;

    public Bola(String cor, double circunferencia, String material) {
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    public void trocarCor(String nomeCor){
        this.cor = nomeCor;
    }

    public void mostrarCor(){
        System.out.println("A cor da bola é" + cor);
    }
}
