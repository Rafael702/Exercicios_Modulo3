package com.zup.Modulo3.aquecimento;

import java.util.Scanner;

public class SistemaRestaurante {

    public static Scanner capturarDados(String mensagem) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        return sc;
    }

    public static void menu() {
        System.out.println("Seja Bem Vindo ao BM Lugar");
        System.out.println("Digite 1: Para Adicionar Pratos");
        System.out.println("Digite 2: Para Exibir o Cardápio");
        System.out.println("Digite 3: Para Sair Do Programa");
    }

    public static Prato cadastrarPratos() {
        String nome = capturarDados("Informe o nome do Prato:").nextLine();
        double valorDoPrato = capturarDados("Informe o valor do Prato:").nextDouble();

        Prato prato = new Prato(nome, valorDoPrato);

        return prato;
    }

    public static Ingrediente cadastrarIngredientes() {
        String nome = capturarDados("Nome do Ingrediente:").nextLine();

        Ingrediente ingredientes = new Ingrediente(nome);

        return ingredientes;

    }

    private final static int OPCAO_UM = 1;
    private final static int OPCAO_DOIS = 2;
    private final static int OPCAO_TRES = 3;

    public static void executar() {

        Cardapio cardapio = new Cardapio();
        boolean chave = true;

        while (chave) {

            menu();
            int option = capturarDados("Digite a opção desejada: ").nextInt();

            if (option == OPCAO_UM) {

                Prato prato = cadastrarPratos();
                Ingrediente ingredientes = cadastrarIngredientes();

                prato.adicionarIngredientes(ingredientes);
                cardapio.adicionarPrato(prato);

            } else if (option == OPCAO_DOIS) {
                cardapio.exibirListaPratos();
            }else if(option == OPCAO_TRES){
                System.out.println("Agradecemos por usar o programa");
                chave = false;
            }else{
                System.out.println("Digite uma opção válida, de acordo com o menu.");
            }
        }
        System.out.println("------------------------------------------------------");
        System.out.println("FIM DO PROGRAMA");
        System.out.println("------------------------------------------------------");
    }

}
