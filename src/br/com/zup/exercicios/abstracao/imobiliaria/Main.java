package br.com.zup.exercicios.abstracao.imobiliaria;

public class Main {
    public static void main(String[] args) {
        CatalogoImobiliaria catalogo = new CatalogoImobiliaria();
        Imovel imovel = new Imovel("Rua Afonso Padilha","Jorge",450);
        Imovel imovel2 = new Imovel("Rua Condonoente","Francis",750);
        Imovel imovel3 = new Imovel("Rua Patifilio","Robert",450);

        imovel.adicionarMoradores(Sistema.criarMorador());
        catalogo.cadastrarImovel(imovel);
        catalogo.cadastrarImovel(imovel2);
        catalogo.cadastrarImovel(imovel3);
        System.out.println(imovel.toString());


    }
}
