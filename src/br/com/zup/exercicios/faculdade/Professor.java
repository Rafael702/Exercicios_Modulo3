package br.com.zup.exercicios.faculdade;


public class Professor extends Funcionarios{
    private int nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int qtdDeAlunos;
    private int qtdDeTurmas;

    public Professor(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, int nivelDeGraduacao, String disciplinaMinistrada, int qtdDeAlunos, int qtdDeTurmas) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdDeAlunos = qtdDeAlunos;
        this.qtdDeTurmas = qtdDeTurmas;
    }

    public Professor(String nome, String cpf, String numeroDeRegistro, double salario, int nivelDeGraduacao, String disciplinaMinistrada, int qtdDeAlunos, int qtdDeTurmas) {
        super(nome, cpf, numeroDeRegistro, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdDeAlunos = qtdDeAlunos;
        this.qtdDeTurmas = qtdDeTurmas;
    }

    public int getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(int nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQtdDeAlunos() {
        return qtdDeAlunos;
    }

    public void setQtdDeAlunos(int qtdDeAlunos) {
        this.qtdDeAlunos = qtdDeAlunos;
    }

    public int getQtdDeTurmas() {
        return qtdDeTurmas;
    }

    public void setQtdDeTurmas(int qtdDeTurmas) {
        this.qtdDeTurmas = qtdDeTurmas;
    }


}
