package br.com.zup.exercicios.faculdade;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionarios {
    List<Professor> professoresSupervisionados = new ArrayList<>();

    public Coordenador(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
    }

    public Coordenador(String nome, String cpf, String numeroDeRegistro, double salario, List<Professor> professoresSupervisionados) {
        super(nome, cpf, numeroDeRegistro, salario);
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public void adicionarProfessores(Professor prof) {
        professoresSupervisionados.add(prof);
    }

    @Override
    public double aumentaSalario(){
        return getSalario() * 0.5;
    }
}
