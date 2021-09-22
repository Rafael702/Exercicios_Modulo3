package br.com.zup.exemplos.encapsulamento.exemplo1;

public class TecnicoAdministrativo extends Funcionario{
    private String departamento;

    public TecnicoAdministrativo(String nome, double salario,String ctps, String cpf, String departamento){
        super(nome,salario,ctps,cpf);
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

}
