package br.com.zup.exercicios.exerciciolevelup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Imovel {
    private Morador morador;
    private Funcionario funcionario;
    private String endereco;
    private double valorAluguel;

    List<Morador> listaDeMoradores = new ArrayList<>();

    public Imovel() {
    }

    public Imovel(String endereco, double valorAluguel, Morador morador, Funcionario funcionario) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.morador = morador;
        this.funcionario = funcionario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public List<Morador> getListaDeMoradores() {
        return listaDeMoradores;
    }

    public Morador getMorador() {
        return morador;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public Morador informacoesMorador(Morador morador, Scanner sc) {
        sc.nextLine();
        System.out.println("Informe o nome do Morador: ");
        String nome = sc.nextLine();

        System.out.println("Informe o CPF do morador:");
        String cpf = sc.nextLine();

        morador = new Morador(nome, cpf);

        return morador;
    }

    public void cadastrarMoradores(Morador morador) {
        morador = new Morador(morador.getNome(), morador.getCpf());
        listaDeMoradores.add(morador);
    }

    public void exibirListaMoradores() {
        System.out.println("---------------Moradores cadastrados------------------ ");
        for (Morador moradores : listaDeMoradores) {
            System.out.println("Nome: " + moradores.getNome());
            System.out.println("CPF: " + moradores.getCpf());
        }
    }

    @Override
    public String toString() {
        StringBuffer referencia = new StringBuffer();
        referencia.append("Endereço: " + endereco);
        referencia.append("\nValor do Aluguel: " + valorAluguel);
        referencia.append("\nMorador(a)" + morador);
        referencia.append("\nFuncionario" + funcionario);
        return referencia.toString();
    }
}
