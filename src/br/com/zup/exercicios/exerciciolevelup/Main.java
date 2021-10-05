package br.com.zup.exercicios.exerciciolevelup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final int OPCAO_UM = 1;
    private final int OPCAO_DOIS = 2;
    private final int OPCAO_TRES = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Morador morador = new Morador();
        Imovel imovel = new Imovel();
        Funcionario funcionario = new Funcionario("Ferdinando");
        CatalogoImoveis catalogoImoveis = new CatalogoImoveis(imovel);

        System.out.println("----------------------------------------------------");
        System.out.println("Cadastrando Moradores:");
        morador = new Morador("Johny", "4567809-05");
        imovel.cadastrarMoradores(morador);
        imovel.exibirListaMoradores();

        System.out.println("----------------------------------------------------");
        System.out.println("Cadastrando Imóveis:");
        imovel = new Imovel("Rua Leopoldo", 150, morador, funcionario);
        catalogoImoveis.cadastrarImoveis(imovel);

        catalogoImoveis.exibirImoveis();



    }
}
