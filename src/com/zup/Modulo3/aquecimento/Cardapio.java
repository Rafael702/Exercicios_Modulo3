package com.zup.Modulo3.aquecimento;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    Prato prato;

    List<Prato> listaDePratos = new ArrayList<>();

    public Cardapio() {
    }

    public Cardapio(Prato prato) {
        this.prato = prato;
    }

    public void adicionarPrato(Prato prato){
        listaDePratos.add(prato);
    }

    public void exibirListaPratos(){
        for(Prato pratos: listaDePratos){
        System.out.println("Nome: " + pratos.getNome() + "| Valor: " + pratos.getValorDoPrato()
        + "| Ingredientes: " + pratos.getListaDeIngredientes());
        }
    }
}
