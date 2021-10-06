package br.com.zup.exercicios.abstracao.imobiliaria;

import java.util.Scanner;

public class Sistema {

    private final static int OPCAO_UM = 1;
    private final static int OPCAO_DOIS = 2;
    private final static int OPCAO_TRES = 3;
    private final static int OPCAO_QUATRO = 4;

    private static Scanner capturarDados(String mensagem) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        return sc;
    }


    public static void menuPrincipal() {
        System.out.println("Digite 1: Para Adicionar um imóvel a lista.");
        System.out.println("Digite 2: Para Exibir a lista.");
        System.out.println("Digite 3: Para Remover um Morador.");
        System.out.println("Digite 4: Para Sair do Programa.");
    }

    private static Morador criarMorador(CatalogoImobiliaria catalogo, Imovel imovel) {
        String nome = capturarDados("Informe o nome do Morador: ").nextLine();
        String cpf = capturarDados("Informe o CPF do " + nome + ":").nextLine();

        Morador morador = new Morador(nome, cpf);

        if (verificarCpf(catalogo, morador)) {
            System.out.println("ESTE CPF JÁ ESTÁ CADASTRADO");
        } else {
            imovel.adicionarMoradores(morador);
        }

        return morador;
    }


    public static Imovel criarImovel() {
        String rua = capturarDados("Informe o nome da Rua em que está localizado o imóvel:").nextLine();
        String funcionario = capturarDados("Informe o nome do Funcionário:").nextLine();
        double valorAluguel = capturarDados("Informe o valor do Aluguel").nextDouble();

        Imovel imovel = new Imovel(rua, funcionario, valorAluguel);

        return imovel;
    }

    public static boolean verificarCpf(CatalogoImobiliaria catalogoImobiliaria, Morador morador) {
        String cpfDuplicado = morador.getCpf();

        for (Imovel refencia : catalogoImobiliaria.imovels) {
            for (Morador listaMorador : refencia.getMoradores()) {
                if (listaMorador.getCpf().equals(cpfDuplicado)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void removerMorador(CatalogoImobiliaria catalogoImobiliaria) {
        String cpf = capturarDados("Informe o CPF do Morador:").nextLine();
        Morador moradorASerRemovido = null;
        for (Imovel referencia : catalogoImobiliaria.imovels) {
            for (Morador listaMorador : referencia.getMoradores()) {
                if (listaMorador.getCpf().equals(cpf)) {
                    System.out.println("CPF REMOVIDO COM SUCESSO!!!");
                    moradorASerRemovido = listaMorador;
                }
            }
            referencia.getMoradores().remove(moradorASerRemovido);
        }
    }

    public static void run() {
        CatalogoImobiliaria catalogo = new CatalogoImobiliaria();
        boolean chave = true;

        while (chave) {

            menuPrincipal();
            int opcao = capturarDados("Digite a sua opção:").nextInt();

            if (opcao == OPCAO_UM) {
                Imovel imovel = criarImovel();
                Morador morador = criarMorador(catalogo, imovel);

                catalogo.cadastrarImovel(imovel);

                System.out.println("Imovel Cadastrado com sucesso!!!");
            } else if (opcao == OPCAO_DOIS) {
                catalogo.exibirLista();
            } else if (opcao == OPCAO_TRES) {
                removerMorador(catalogo);
            } else if (opcao == OPCAO_QUATRO) {
                chave = false;
                System.out.println("Saindo do menu.");

            }
        }
    }

}
