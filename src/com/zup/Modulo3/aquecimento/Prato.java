package com.zup.Modulo3.aquecimento;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private Ingredientes ingrediente;
    private String nome;
    private double valorDoPrato;

    List<Ingredientes> listaDeIngredientes = new ArrayList<>();

    public Prato(String nome, double valorDoPrato) {
        this.nome = nome;
        this.valorDoPrato = valorDoPrato;
    }

    public Prato(Ingredientes ingrediente, String nome, double valorDoPrato) {
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

    public Ingredientes getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingredientes ingrediente) {
        this.ingrediente = ingrediente;
    }

    public List<Ingredientes> getListaDeIngredientes() {
        return listaDeIngredientes;
    }

    public void adicionarIngredientes(Ingredientes ingredientes){
        listaDeIngredientes.add(ingredientes);
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
