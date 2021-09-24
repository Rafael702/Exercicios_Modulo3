package br.com.zup.exercicios.listamodelagemclasses2.pessoa.pessoaPrivada;

public class Pessoa {
    private String nome;
    private String dataDeNascimento;
    private int anoDeNascimento;
    private double altura;
    int anoAtual = 2021;
    int idade;


    public Pessoa() {

    }

    public Pessoa(String nome, String dataDeNascimento, int anoDeNascimento, double altura) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
        this.anoDeNascimento = anoDeNascimento;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getDataDeNascimento() {

        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {

        this.dataDeNascimento = dataDeNascimento;
    }

    public double getAltura() {

        return altura;
    }

    public void setAltura(int altura) {

        this.altura = altura;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public int getIdade() {
        return idade;
    }

    public int idade() {
        return idade = anoAtual - anoDeNascimento;
    }

    public void imprimirIdade(int idadePessoa) {
        System.out.println("A idade desta pessoa é: " + idadePessoa);
    }

    public void imprimirDados() {
        System.out.println("Dados da Pessoa: ");
        System.out.println("O nome desta pessoa é: " + nome);
        System.out.println("A data de nascimento desta pessoa é: " + dataDeNascimento + "." + anoDeNascimento);
        imprimirIdade(idade);
        System.out.println("A altura desta pessoa é: " + altura);
    }

}
