package br.com.zup.exercicios.listamodelagemclasses2.televisao;

import br.com.zup.exercicios.listamodelagemclasses2.televisao.televisaoprivada.TelevisaoPrivada;
import br.com.zup.exercicios.listamodelagemclasses2.televisao.televisaoprivada.controleprivado.ControlePrivado;

public class Main {
    public static void main(String[] args) throws Exception{
        TelevisaoPrivada tv = new TelevisaoPrivada();
        ControlePrivado controller = new ControlePrivado(tv);

        controller.aumentarVolume(5);
        controller.diminuirVolume(1);
        controller.aumentarVolume(5);
        controller.diminuirVolume(4);

        controller.aumentarCanal(13);
        controller.diminuirCanal(10);

        controller.trocarCanal(10);
        controller.trocarCanal(5);
        controller.trocarCanal(4);

        controller.consultaCanalEVolume();



    }
}
