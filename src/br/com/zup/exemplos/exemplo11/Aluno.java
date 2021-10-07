package br.com.zup.exemplos.exemplo11;

public class Aluno {
    private String nome;
    private String cpf;
    private Turno turno;
    private Nivel nivel;

    public Aluno() {

    }

    public Aluno(String nome, String cpf, Turno turno) {
        this.nome = nome;
        this.cpf = cpf;
        this.turno = turno;
    }


    public Aluno(String nome, String cpf, Turno turno, Nivel nivel) {
        this.nome = nome;
        this.cpf = cpf;
        this.turno = turno;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", turno=" + turno +
                ", nivel=" + nivel +
                '}';
    }
}
