package br.com.zup.exercicios.listamodelagemclasses.cartaocredito;

public class Main {
    public static void main(String[] args) {
        CartãoCredito objeto = new CartãoCredito(1_000,"Jhony");

        objeto.realizarCompra(500);
        objeto.diminuirLimite();

        objeto.imprimirFatura();
        objeto.realizarCompra(500);
        objeto.imprimirFatura();

    }
}
