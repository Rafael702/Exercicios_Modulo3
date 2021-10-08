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

    public static List<Fatura> pesquisarFaturas(String emailParaPesquisa) throws Exception{
       List<Fatura> faturasRelacionada = new ArrayList<>();
        for(Consumidor consumidorReferencia: ServicoConsumidor.getConsumidores()){
            if(emailParaPesquisa.equals(consumidorReferencia.getEmail())){
                for(Fatura faturasReferencia : faturas){
                    if(faturasReferencia.getConsumidor().getEmail().equals(emailParaPesquisa)){
                        faturasRelacionada.add(faturasReferencia);
                    }
                }
            }
            System.out.println("\n" + faturasRelacionada + "\n");
            return faturasRelacionada;
        }
        throw new Exception("Este e-mail não foi cadastrado.");
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
