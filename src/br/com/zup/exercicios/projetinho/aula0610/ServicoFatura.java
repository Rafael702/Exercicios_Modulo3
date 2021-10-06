package br.com.zup.exercicios.projetinho.aula0610;

import java.util.ArrayList;
import java.util.List;

public class ServicoFatura{
    private static List<Fatura> faturas = new ArrayList<>();

    public static Fatura cadastrarFatura(String email, double valor, String dataDeVencimento) throws Exception{
        Consumidor consumidor = ServicoConsumidor.pesquisarConsumidorPorEmail(email);

        Fatura fatura = new Fatura(consumidor, valor,dataDeVencimento);
        faturas.add(fatura);
        return fatura;
    }

}
