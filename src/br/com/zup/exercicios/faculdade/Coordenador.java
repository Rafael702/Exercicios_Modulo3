package br.com.zup.exercicios.faculdade;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionarios {
    List<Professor> professoresSupervisionados = new ArrayList<>();

    public Coordenador(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
    }

    public Coordenador(String nome, String cpf, String numeroDeRegistro, double salario) {
        super(nome, cpf, numeroDeRegistro, salario);
    }

    public void adicionarProfessores(Professor prof) {
        professoresSupervisionados.add(prof);

        }

        public void exibirLista(){
            if(professoresSupervisionados.size() <= 5) {
                for (Professor lista : professoresSupervisionados) {
                    System.out.println("-----------------------------------------");
                    System.out.println("Nome do Professor: " + lista.getNome());
                    System.out.println("Matéria: " + lista.getDisciplinaMinistrada());

                    if (professoresSupervisionados.size() >= 5){
                        System.out.println("Apenas estes 5 professores estão sendo supervisionados pelo" + getNome());
                    }
                }
            }
        }


    @Override
    public double aumentaSalario() {
        return getSalario() * 0.5;
    }
}
