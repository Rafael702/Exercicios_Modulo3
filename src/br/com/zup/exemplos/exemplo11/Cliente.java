package br.com.zup.exemplos.exemplo11;

public class Cliente {
    private String nome;
    private String cpf;
    private Turno turno;

    public Cliente(String nome, String cpf, Turno turno) {
        this.nome = nome;
        this.cpf = cpf;
        this.turno = turno;
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
}
