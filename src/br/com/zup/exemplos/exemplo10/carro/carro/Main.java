package br.com.zup.exemplos.exemplo10.carro.carro;

import br.com.zup.exemplos.exemplo10.carro.carro.Carro;

public class Main {
    public static void main(String[] args) {
        Estacionamento shopping = new Estacionamento();

        Carro obj1 = new Carro("ABC897", "Azul", "Ford Ka", "Ford");
        Carro obj2 = new Carro("ABC898", "Vermelha", "Ford Ka", "Ford");
        Carro obj3 = new Carro("ABC197", "Branco", "Ford Ka", "Ford");

        shopping.adicionarCarro(obj1);
        shopping.adicionarCarro(obj2);
        shopping.adicionarCarro(obj3);


        shopping.consultarCarro("ABC898");
        shopping.mostrarLista();
        shopping.removerCarro("ABC197");
        shopping.mostrarLista();


    }
}
