package br.com.zup.exercicios.exerciciolevelup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogoImoveis {
    private Imovel imovel;
    List<Imovel> listaDeImoveis = new ArrayList<>();

    public CatalogoImoveis() {
    }

    public CatalogoImoveis(Imovel imovel) {
        this.imovel = imovel;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Imovel informacoesImoveis(Imovel imovel, Scanner sc) {
        System.out.println("Informe o endereço do imovel: ");
        String endereco = sc.nextLine();

        System.out.println("Infome o valor do aluguel do imóvel: ");
        double valorAluguel = sc.nextDouble();

        imovel = new Imovel(endereco, valorAluguel, imovel.getMorador(), imovel.getFuncionario());

        return imovel;

    }

    public void cadastrarImoveis(Imovel imovel) {
        listaDeImoveis.add(imovel);
    }

    public void exibirImoveis() {
        System.out.println("---------------Imóveis cadastrados------------------ ");
        for (Imovel DadosImovel : listaDeImoveis) {
            System.out.println(DadosImovel);

        }
    }

}
