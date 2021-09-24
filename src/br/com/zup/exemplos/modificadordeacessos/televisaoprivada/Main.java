package br.com.zup.exemplos.modificadordeacessos.televisaoprivada;

import br.com.zup.exercicios.listamodelagemclasses2.televisao.televisaoprivada.TelevisaoPrivada;
import br.com.zup.exercicios.listamodelagemclasses2.televisao.televisaoprivada.controleprivado.ControlePrivado;

public class Main {
    public static void main(String[] args) {
        TelevisaoPrivada tv = new TelevisaoPrivada(0,0);
        ControlePrivado controle = new ControlePrivado(tv);

        System.out.println("Panasonic");
    }
}
