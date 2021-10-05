package com.zup.Modulo3.aquecimento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Prato {
    private Ingrediente ingrediente;
    private String nome;
    private double valorDoPrato;

    List<Ingrediente> listaDeIngredientes = new ArrayList<>();

    public Prato(String nome, double valorDoPrato) {
        this.nome = nome;
        this.valorDoPrato = valorDoPrato;
    }

    public Prato(Ingrediente ingrediente, String nome, double valorDoPrato) {
        this.ingrediente = ingrediente;
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

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public List<Ingrediente> getListaDeIngredientes() {
        return listaDeIngredientes;
    }

    public void adicionarIngredientes(Ingrediente ingredientes){
        Ingrediente[] vetorIngredientes1 = new Ingrediente[5];
        listaDeIngredientes.add(vetorIngredientes1[5]);
    }

    @Override
    public String toString(){
        StringBuffer retorno = new StringBuffer();
        retorno.append("Nome do prato: " + nome);
        retorno.append("Valor do Prato: " + valorDoPrato);
        retorno.append("Ingredientes" + listaDeIngredientes);
        return retorno.toString();
    }

}
