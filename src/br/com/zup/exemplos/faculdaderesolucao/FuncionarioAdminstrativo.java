package br.com.zup.exemplos.faculdaderesolucao;

public class FuncionarioAdminstrativo extends Funcionario {
    private String funcaoAdministrativa;
    private String senioridade;

    public FuncionarioAdminstrativo(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdministrativa) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public FuncionarioAdminstrativo(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
    }
}
