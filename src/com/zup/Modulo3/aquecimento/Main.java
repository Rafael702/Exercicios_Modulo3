package com.zup.Modulo3.aquecimento;

public class Main {
    public static void main(String[] args) {
        Ingredientes ingredientes =  new Ingredientes("Massa, Carne moida e molho de tomate");
        Prato prato = new Prato(ingredientes,"Panqueca", 20);
        Cardapio cardapio = new Cardapio(prato);

        prato.adicionarIngredientes();
        cardapio.adicionarPrato();
        cardapio.exibirListaPratos();
    }
}
