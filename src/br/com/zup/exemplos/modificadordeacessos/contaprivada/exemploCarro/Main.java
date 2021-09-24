package br.com.zup.exemplos.modificadordeacessos.contaprivada.exemploCarro;

import br.com.zup.exemplos.modificadordeacessos.contaprivada.exemploCarro.carro.CarroPrivado;

public class Main {
    public static void main(String[] args) {
        CarroPrivado objeto = new CarroPrivado();

        System.out.println(objeto.getNome());
        objeto.setNome("Honda git");
        System.out.println(objeto.getNome());





    }
}
