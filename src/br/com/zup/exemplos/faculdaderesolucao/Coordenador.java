package br.com.zup.exemplos.faculdaderesolucao;


import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario {
    List<Professor> listaDeProfessores = new ArrayList<>();


    public Coordenador(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
    }


    public void adicionarProfessores(Professor prof) {
        listaDeProfessores.add(prof);
    }

    @Override
    public double aumentarSalario() {
        double novoSalario = (0.1 * getSalario()) + getSalario();
        return novoSalario;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nNome: " + getNome());
        retorno.append("\nCPF: " + getCpf());
        retorno.append("\nNúmero do registro: " + getNumeroDeRegistro());
        retorno.append("\nOrgão de Lotação: " + getOrgaoDeLotacao());
        retorno.append("\nSalário: " + getSalario());
        retorno.append("\nQuantidade de professores que " + getNome() + " supervisiona:" + listaDeProfessores.size());
        retorno.append("\nLista de professores supervisionados:" + listaDeProfessores);
        return retorno.toString();
    }
}
