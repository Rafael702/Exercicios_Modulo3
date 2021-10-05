package br.com.zup.exercicios.abstracao.imobiliaria;

public class Morador extends Pessoa{

    public Morador(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public String toString() {
        return "Morador{ " + super.toString()+
                "}";
    }
}
