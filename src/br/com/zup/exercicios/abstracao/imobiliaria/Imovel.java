package br.com.zup.exercicios.abstracao.imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String endereco;
    private double valorDoAluguel;
    private String funcionarioResponsavel;
    private List<Morador> moradores = new ArrayList<>();

    public Imovel(String endereco, String funcionarioResponsavel, double valorDoAluguel) {
        this.endereco = endereco;
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.valorDoAluguel = valorDoAluguel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(double valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }

    public String getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(String funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }

    public void adicionarMoradores(Morador novoMorador){
        moradores.add(novoMorador);
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "endereco='" + endereco + '\'' +
                ", valorDoAluguel=" + valorDoAluguel +
                ", funcionarioResponsavel='" + funcionarioResponsavel + '\'' +
                ", Quantidade Moradores: " + moradores.size() + "Nomes: " + moradores +
                '}';
    }
}
