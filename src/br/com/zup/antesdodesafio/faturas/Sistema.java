package br.com.zup.antesdodesafio.faturas;

import java.util.List;
import java.util.Scanner;

public class Sistema {
    private final static int OPCAO_UM = 1;
    private final static int OPCAO_DOIS = 2;
    private final static int OPCAO_TRES = 3;
    private final static int OPCAO_QUATRO = 4;


    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    private static void menuPrincipal() {
        System.out.println("Digite 1: Para Adicionar uma Fatura");
        System.out.println("Digite 2: Para Mostrar A Fatura");
        System.out.println("Digite 3: Para Pesquisar Uma Fatura");
        System.out.println("Digite 4: Para Sair do Programa");

    }

    private static void menuTipoConsumidor() {
        List<TipoConsumidor> listaTipoConsumidor = ServicoConsumidor.mostrarTiposDeConsumidor();
        System.out.println("Tipos de Consumidores:");
        for (int i = 0; i < listaTipoConsumidor.size(); i++) {
            System.out.println(listaTipoConsumidor.get(i));
        }
    }

    private static Consumidor cadastrarConsumidor() throws Exception {
        String nome = capturarDados("Informe o nome do Colaborador:").nextLine();
        String email = capturarDados("Informe o email do Colaborador:").nextLine();
        menuTipoConsumidor();
        String tipoDeConsumidor = capturarDados("Informe o tipo de consumidor:").nextLine();

        return ServicoConsumidor.cadastrarConsumidor(nome, email,tipoDeConsumidor);
    }

    public static Fatura cadastrarFaturas() throws Exception {
        double valorPagamento = capturarDados("Informe o valor de pagamento da Fatura:").nextDouble();
        String dataDeVecimento = capturarDados("Informe a data de vencimento da Fatura: Ex: dd/mm/AAAA").nextLine();
        Consumidor consumidor = cadastrarConsumidor();
        System.out.println("Fatura Cadastrada Com SUCESSO!!!");

        return ServicoFatura.cadastrarFatura(consumidor, valorPagamento, dataDeVecimento);
    }

    public static List<Fatura> pesquisarFaturas() throws Exception{
        String emailParaPesquisa = capturarDados("Informe o e-mail que você deseja fazer a pesquisa:").nextLine();

        return ServicoFatura.pesquisarFaturas(emailParaPesquisa);
    }


    public static void saindoDoPrograma() throws Exception {
        System.out.println("Saindo do Programa");
        for (int i = 1; i <= 20; i++) {
            System.out.print("-");
            Thread.sleep(500);
            if(i == 10){
                System.out.print("---COME-IN-BACK---");
            }
        }
    }

    public static boolean executar() throws Exception {

        boolean continuarMenu = true;
        System.out.println("---BEM-VINDO-AO-FACILITADOR-DE-EMISSÃO-DE-FATURAS---");
        while (continuarMenu) {
            menuPrincipal();
            int opcao = capturarDados("Digite a sua opção:").nextInt();
            if (opcao == OPCAO_UM) {
                cadastrarFaturas();
            } else if (opcao == OPCAO_DOIS) {
                ServicoFatura.exibirLista();
            } else if (opcao == OPCAO_TRES) {
                pesquisarFaturas();
            } else if (opcao == OPCAO_QUATRO) {
                saindoDoPrograma();
                continuarMenu = false;
            } else {
                System.out.println("Digite uma opção válida, de acordo com o MENU.");
            }
        }
        return continuarMenu;
    }

}
