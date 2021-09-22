package br.com.zup.exemplos.exemploclasses.pessoa.pessoaPrivada;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {
    // Atributos
    Calendar calendar = Calendar.getInstance();
    private String nome;
    private Data dataDeNascimento;
    private double altura;
    private int idade;
    private int ano = calendar.get(Calendar.YEAR);

    // Métodos Construtores
    public Pessoa() {

    }

    public Pessoa(String nome, Data dataDeNascimento, double altura) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }

    // Criando getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Data dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    // Criando método para calcular idade da pessoa
    public void calcularIdade() {
        int idade = ano - dataDeNascimento.getAno();
        this.idade = idade;
    }

    // Classe responsável por imprimir os dados
    public void imprimirDados() {
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Data de nascimento da pessoa: " + dataDeNascimento.getDia() + "/" + dataDeNascimento.getMes() + "/" + dataDeNascimento.getAno());
        System.out.println("Altura da pessoa: " + altura);
        System.out.println("Idade do " + nome + " é: " + idade);
    }
}