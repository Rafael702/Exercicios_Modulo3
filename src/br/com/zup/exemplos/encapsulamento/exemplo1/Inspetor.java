package br.com.zup.exemplos.encapsulamento.exemplo1;

public class Inspetor extends Funcionario{
    private String areaDeVigilancia;

    public Inspetor(String nome, double salario, String ctps, String cpf, String areaDeVigilancia) {
        super(nome, salario, ctps, cpf);
        this.areaDeVigilancia = areaDeVigilancia;
    }

    public String getAreaDeVigilancia() {
        return areaDeVigilancia;
    }

    public void setAreaDeVigilancia(String areaDeVigilancia) {
        this.areaDeVigilancia = areaDeVigilancia;
    }
}
