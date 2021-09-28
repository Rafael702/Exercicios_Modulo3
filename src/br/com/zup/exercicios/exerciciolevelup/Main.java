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
        Menu menu = new Menu();
        Morador morador = new Morador();
        Imovel imovel = new Imovel(morador);
        Funcionario funcionario = new Funcionario("Ferdinando", imovel);
        CatalogoImoveis catalogoImoveis = new CatalogoImoveis(imovel);

        System.out.println("Cadastrando Imóveis.");
        imovel = new Imovel("Rua Leopoldo", 150, morador);
        morador = new Morador("Johny", "4567809-05");
        imovel.cadastrarMoradores(morador);


    }
}
