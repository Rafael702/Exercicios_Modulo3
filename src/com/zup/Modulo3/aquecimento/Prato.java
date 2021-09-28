package com.zup.Modulo3.aquecimento;

public class Prato {
    private String nome;
    private  double valorDoPrato;

    public Prato(String nome, double valorDoPrato) {
        this.nome = nome;
        this.valorDoPrato = valorDoPrato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorDoPrato() {
        return valorDoPrato;
    }

    public void setValorDoPrato(double valorDoPrato) {
        this.valorDoPrato = valorDoPrato;
    }
}
