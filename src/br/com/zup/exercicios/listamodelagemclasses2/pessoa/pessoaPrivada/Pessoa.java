package br.com.zup.exercicios.listamodelagemclasses2.pessoa.pessoaPrivada;

public class Pessoa {
    private String nome;
    private String dataDeNascimento;
    private double altura;

    public Pessoa(){

    }

    public Pessoa(String nome, String dataDeNascimento, double altura){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
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

    public double Altura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void imprimirDados(){
        System.out.println("Dados da Pessoa: ");
        System.out.println("O nome desta pessoa é: " + nome);
        System.out.println("A data de nascimento desta pessoa é: " + dataDeNascimento);
        System.out.println("A altura desta pessoa é: " + altura);
    }
}
