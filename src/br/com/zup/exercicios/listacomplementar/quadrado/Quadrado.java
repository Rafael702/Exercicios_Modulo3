package br.com.zup.exercicios.listacomplementar.quadrado;

public class Quadrado {
    double tamanhoLado;

    public Quadrado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    public void mudaValorLado(double lado) {
        this.tamanhoLado = lado;
    }

    public double valorLado() {
        return tamanhoLado;
    }

    public double calculoArea() {
        return tamanhoLado * tamanhoLado;
    }


}
