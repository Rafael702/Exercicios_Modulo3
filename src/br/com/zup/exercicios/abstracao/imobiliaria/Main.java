package br.com.zup.exercicios.abstracao.imobiliaria;

public class Main {
    public static void main(String[] args) {
        CatalogoImobiliaria catalogo = new CatalogoImobiliaria();
        Imovel imovel = new Imovel();

        catalogo.cadastrarImovel(Sistema.criarImovel());
        System.out.println(catalogo);

    }
}
