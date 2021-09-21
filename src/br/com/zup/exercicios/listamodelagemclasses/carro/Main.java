package br.com.zup.exercicios.listamodelagemclasses.carro;

public class Main {
    public static void main(String[] args) {
        Carro carros = new Carro("McQuenn", "900kg", "Rost-eze", "vermelho", 220000);

        System.out.println("O nome do carro é: " + carros.nome);
        System.out.println("O peso do carro é: " + carros.peso);
        System.out.println("O fabricante do carro é: " + carros.fabricante);
        System.out.println("A cor do carro é: " + carros.cor);
        System.out.println("O valor do carro é: R$" + (int)carros.valorDoCarro);

        carros.darDesconto(100000);
        System.out.println("Com desconto, o valor do carro fica: R$" + (int)carros.valorDoCarro);



    }
}
