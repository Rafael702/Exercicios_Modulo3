package br.com.zup.exercicios.abstracao.imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class CatalogoImobiliaria implements ModeloCatalogo {
    List<Imovel> imovels = new ArrayList<>();

    @Override
    public void cadastrarImovel(Imovel novoImovel) {
        imovels.add(novoImovel);
    }

    @Override
    public String toString() {
        return "CatalogoImobiliaria{" +
                "imovels=" + imovels +
                '}';
    }
}
