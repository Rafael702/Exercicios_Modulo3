package br.com.zup.exercicios.projetinho.aula0610;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    //Nossa Linha de frente com o usuário

    private static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static void menu(){
        System.out.println("SEJA BEM VINDO A EMPRESA FICTICIA UNIVERSAL");
        System.out.println("Digite 1 - Para cadastrar consumidor");
        System.out.println("Digite 2 - Para cadastrar uma fatura");
        System.out.println("Digite 3 - Consultar Faturas de um Consumidor.");
        System.out.println("Digite 4 - Para Sair do Programa");
    }

    public static Consumidor cadastrarConsumidor() throws Exception{
        String nome = capturarDados("Digite o nome do consumidor:").nextLine();
        String email = capturarDados("Digite o email do consumidor:").nextLine();

        return ServicoConsumidor.cadastrarConsumidor(nome,email);
    }

   public static Fatura cadastrarFatura() throws Exception{
        String email = capturarDados("Digite o email do consumidor:").nextLine();
        double valorDaFatura = capturarDados("Digite o valor da Fatura:").nextDouble();
        String dataDeVencimento = capturarDados("Digite a data de vencimento da Fatura:").nextLine();

        return ServicoFatura.cadastrarFatura(email, valorDaFatura,dataDeVencimento);
   }

   public static List<Fatura> pesquisarFatura(){
        String email = capturarDados("Digite o email do consumidor:").nextLine();
        List<Fatura> faturasDoUsuario = ServicoFatura.pesquisarFaturaPeloEmailConsumidor(email);
        return faturasDoUsuario;
   }


}
