package br.com.zup.exercicios.abstracao.imobiliaria;

public class Main {
    public static void main(String[] args) {
        CatalogoImobiliaria catalogo = new CatalogoImobiliaria();
        Imovel imovel = new Imovel("Rua Afonso Padilha","Jorge",450);
        Imovel imovel2 = new Imovel("Rua Condonoente","Francis",750);
        Imovel imovel3 = new Imovel("Rua Patifilio","Robert",450);
        Morador morador = new Morador("Afonso", "902374092740-09");
        Morador morador2 = new Morador("Leopoldo", "7321389740-87");
        Morador morador3 = new Morador("Afonso", "932442343232-67");
        Morador morador4 = new Morador("Leo", "32132313121-54");

        imovel.adicionarMoradores(morador);
        imovel2.adicionarMoradores(morador2);
        imovel3.adicionarMoradores(morador3);
        imovel3.adicionarMoradores(morador4);
        catalogo.cadastrarImovel(imovel);
        catalogo.cadastrarImovel(imovel2);
        catalogo.cadastrarImovel(imovel3);
        catalogo.exibirLista();

        System.out.println("-----------------------------------");
        imovel.removerMoradores("902374092740-09");
        System.out.println("-----------------------------------");
        catalogo.exibirLista();

    }
}
