package br.com.zup.exercicios.abstracao.imobiliaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    private final static int OPCAO_UM = 1;
    private final static int OPCAO_DOIS = 2;
    private final static int OPCAO_TRES = 3;

    private static Scanner capturarDados(String mensagem) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        return sc;
    }

    public static void menuPrincipal(){
        System.out.println("Digite 1: Para Adicionar um imóvel a lista.");
        System.out.println("Digite 2: Para Exibir a lista.");
        System.out.println("Digite 3: Para Sair do Programa.");

    }


    private static Morador criarMorador() {
        String nome = capturarDados("Informe o nome do Morador: ").nextLine();
        String cpf = capturarDados("Informe o CPF do " + nome + ":").nextLine();

        Morador morador = new Morador(nome, cpf);
        return morador;
    }

    public static Imovel criarImovel() {
        String rua = capturarDados("Informe o nome da Rua em que está localizado o imóvel:").nextLine();
        String funcionario = capturarDados("Informe o nome do Funcionário:").nextLine();
        double valorAluguel = capturarDados("Informe o valor do Aluguel").nextDouble();

        Imovel imovel = new Imovel(rua, funcionario, valorAluguel, criarMorador());

        return imovel;
    }




    public static void run(){
        CatalogoImobiliaria catalogo = new CatalogoImobiliaria();
        boolean chave = true;

        while(chave) {

            menuPrincipal();
            int opcao = capturarDados("Digite a sua opção:").nextInt();

            if(opcao == OPCAO_UM){
                Imovel imovel = criarImovel();
                catalogo.cadastrarImovel(imovel);

                System.out.println("Cadastrado com sucesso!!!");
            }else if(opcao == OPCAO_DOIS){
                catalogo.exibirLista();
            }else if(opcao == OPCAO_TRES){
                chave = false;
                System.out.println("Saindo do menu.");
            }
        }
    }

}
