package br.com.zup.exemplos.faculdaderesolucao;

public class Professor extends Funcionario{
    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int qtd_alunos;
    private int qtd_turma;


        public Professor(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, int qtd_alunos, int qtd_turma) {
            super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
            this.nivelDeGraduacao = nivelDeGraduacao;
            this.disciplinaMinistrada = disciplinaMinistrada;
            this.qtd_alunos = qtd_alunos;
            this.qtd_turma = qtd_turma;
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

        public int getQtd_alunos() {
            return qtd_alunos;
        }

        public void setQtd_alunos(int qtd_alunos) {
            this.qtd_alunos = qtd_alunos;
        }

        public int getQtd_turma() {
            return qtd_turma;
        }

        public void setQtd_turma(int qtd_turma) {
            this.qtd_turma = qtd_turma;
        }

        @Override
        public String toString(){
            StringBuilder retorno = new StringBuilder();
            retorno.append("Nome: " + getNome());
            retorno.append(" CPF: " + getCpf());
            retorno.append(" Número do registro: " + getNumeroDeRegistro());
            retorno.append(" Orgão de Lotação: " + getOrgaoDeLotacao());
            retorno.append(" Salário: " + getSalario());
            return toString();
        }
}
