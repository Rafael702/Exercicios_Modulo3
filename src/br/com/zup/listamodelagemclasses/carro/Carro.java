package br.com.zup.listamodelagemclasses.carro;

public class Carro {
    int qtdDePortas;
    String modelo;
    String marca;
    double potencia = 2.0;

    public Carro(int qtdDePortas, String modelo, String marca){
        this.qtdDePortas = qtdDePortas;
        this.modelo = modelo;
        this.marca = marca;
    }


}
