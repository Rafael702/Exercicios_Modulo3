package br.com.zup.exercicios.abstracao.imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class ServicoMorador {
    private static List<Morador> moradores = new ArrayList<>();

    public static void cadastrarMoradores(String nome, String cpf, String email){
        Morador morador = new Morador(nome, cpf,email);
        moradores.add(morador);
    }



}
