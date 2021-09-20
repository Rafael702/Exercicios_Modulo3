package br.com.zup.listamodelagemclasses.carro;

public class Main {
    public static void main(String[] args) {
    Carro mcquenn = new Carro(4, "Rost-eze 95", "Rost-eze");

        System.out.println("Quantidade de portas: " + mcquenn.qtdDePortas);
        System.out.println("Modelo do carro: " + mcquenn.modelo);
        System.out.println("Marca do carro: " + mcquenn.marca);
        System.out.println("Potência do carro: " + mcquenn.potencia);

        mcquenn.potencia = 500;

        System.out.println("--------------------------------------------------");

        System.out.println("Quantidade de portas: " + mcquenn.qtdDePortas);
        System.out.println("Modelo do carro: " + mcquenn.modelo);
        System.out.println("Marca do carro: " + mcquenn.marca);
        System.out.println("Potência do carro: " + mcquenn.potencia);
        System.out.println("CATCHAU!!");



    }
}
