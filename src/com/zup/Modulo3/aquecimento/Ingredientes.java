package com.zup.Modulo3.aquecimento;

public class Ingredientes {
    private String nome;

    public Ingredientes(String nome) {
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


