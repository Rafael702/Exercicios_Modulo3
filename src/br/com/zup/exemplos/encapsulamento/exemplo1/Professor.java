package br.com.zup.exemplos.encapsulamento.exemplo1;

public class Professor extends Funcionario{
    private String disciplica;

    public Professor(String nome, double salario, String ctps, String cpf, String materia) {
        super(nome, salario, ctps, cpf);
        this.disciplica = materia;
    }

    public String getDisciplica(){
        return disciplica;
    }

    public void setDisciplica(String disciplica){
        this.disciplica = disciplica;
    }
}
