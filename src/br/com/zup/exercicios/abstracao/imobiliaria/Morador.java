package br.com.zup.exercicios.abstracao.imobiliaria;

public class Morador extends Pessoa{
    private String email;
    public Morador(String nome, String cpf, String email) {
        super(nome, cpf);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Morador{ " + super.toString()+
                " Email: " + email +
                "}";
    }
}
