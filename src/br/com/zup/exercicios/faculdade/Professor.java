package br.com.zup.exercicios.faculdade;


import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionarios {
    List<Turma> listaDeTurmas = new ArrayList<>();
    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int qtdDeAlunos;
    private int qtdDeTurmas;

    public Professor(String nome) {
        super(nome);
    }

    public Professor(String nome, String nivelDeGraduacao, String disciplinaMinistrada, int qtdDeAlunos, int qtdDeTurmas) {
        super(nome);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdDeAlunos = qtdDeAlunos;
        this.qtdDeTurmas = qtdDeTurmas;
    }

    public Professor(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, int qtdDeAlunos, int qtdDeTurmas) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdDeAlunos = qtdDeAlunos;
        this.qtdDeTurmas = qtdDeTurmas;
    }

    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {
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

    public void adicionarTurma(Turma lista) {
        listaDeTurmas.add(lista);
        System.out.println("-------------Lista de Turmas-----------");
        for (Turma alunos : listaDeTurmas) {
            System.out.println("----------------------------------");
            System.out.println("Série: " + alunos.getSerie());
            System.out.println("O período de aulas para esta turma é: " + alunos.getPeriodo());
        }
    }

    @Override
    public String toString(){
        return "Nome: " + this.getNome() + " Senioridade: " + this.getNivelDeGraduacao() + " Disciplina: " + this.getDisciplinaMinistrada();
    }
}
