package br.com.zup.exercicios.exerciciolevelup;

import java.util.HashMap;
import java.util.Map;

public class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        StringBuilder retorna = new StringBuilder();
        retorna.append(": " + nome);
        return retorna.toString();
    }

}
