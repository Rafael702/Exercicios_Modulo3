package com.zup.Modulo3.aquecimento;

public class Ingrediente {
    private String nome;

    public Ingrediente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        StringBuffer retorno = new StringBuffer();
        retorno.append(":" + nome);
        return retorno.toString();
    }
}


