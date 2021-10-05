package br.com.zup.exercicios.abstracao.imobiliaria;

public class Main {
    public static void main(String[] args) {
        CatalogoImobiliaria catalogo = new CatalogoImobiliaria();
        Imovel imovel = new Imovel("Rua Afonso Padilha","Jorge",450);
        Imovel imovel2 = new Imovel("Rua Condonoente","Francis",750);
        Imovel imovel3 = new Imovel("Rua Patifilio","Robert",450);
        Morador morador = new Morador("Leopoldo","031.035.687.09");
        Morador morador2 = new Morador("Leonard","021.067.609.43");
        Morador morador3 = new Morador("Leopoldo","526.109.628.18");

        imovel.adicionarMoradores(morador);
        imovel2.adicionarMoradores(morador2);
        imovel3.adicionarMoradores(morador3);
        catalogo.cadastrarImovel(imovel);
        catalogo.cadastrarImovel(imovel2);
        catalogo.cadastrarImovel(imovel3);
        System.out.println(imovel.toString());


    }
}
