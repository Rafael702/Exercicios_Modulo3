package br.com.zup.antesdodesafio.faturas;

import java.util.ArrayList;
import java.util.List;

public class ServicoFatura {
    private static List<Fatura> faturas = new ArrayList<>();

    public static Fatura cadastrarFatura(Consumidor consumidor, double valorPagamento, String dataDeVencimento){
        Fatura fatura = new Fatura(consumidor,valorPagamento,dataDeVencimento);

        faturas.add(fatura);
        return fatura;
    }

    public static void exibirLista(){
        System.out.println("---------FATURAS-CADASTRADAS-------");
        System.out.println("-----------------------------------");
        for(Fatura faturaReferencia: faturas){
            System.out.println(faturaReferencia);
        }
        System.out.println("-----------------------------------");
    }

}
