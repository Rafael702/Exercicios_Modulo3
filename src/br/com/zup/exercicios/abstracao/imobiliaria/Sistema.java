package br.com.zup.exercicios.abstracao.imobiliaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    private static Scanner capturarDados(String mensagem) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        return sc;
    }


    private static Morador criarMorador() {
        String nome = capturarDados("Informe o nome do Morador: ").nextLine();
        String cpf = capturarDados("Informe o CPF do " + nome + ":").nextLine();

        Morador morador = new Morador(nome, cpf);
        return morador;
    }

    private static Imovel criarImovel() {
        String rua = capturarDados("Informe o nome da Rua em que está localizado o imóvel:").nextLine();
        String funcionario = capturarDados("Informe o nome do Funcionário:").nextLine();
        double valorAluguel = capturarDados("Informe o valor do Aluguel").nextDouble();

        Imovel imovel = new Imovel(rua, funcionario, valorAluguel, criarMorador());

        return imovel;
    }

    private static CatalogoImobiliaria criarCatalogo() {
        CatalogoImobiliaria catalogo = new CatalogoImobiliaria();

        catalogo.cadastrarImovel(criarImovel());

        return catalogo;
    }

    private static void exibirLista(CatalogoImobiliaria catalogoImobiliaria) {
        List<CatalogoImobiliaria> catalogo = new ArrayList<>();

        catalogo.add(catalogoImobiliaria);
        for (CatalogoImobiliaria referencia : catalogo) {
            System.out.println(referencia);
        }
    }

    public static void run(){
        CatalogoImobiliaria catalogoImobiliaria = new CatalogoImobiliaria();

        exibirLista(criarCatalogo());
    }

}
