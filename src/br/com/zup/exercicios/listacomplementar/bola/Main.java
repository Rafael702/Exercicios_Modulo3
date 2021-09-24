package br.com.zup.exercicios.listacomplementar.bola;

public class Main {
    public static void main(String[] args) {
        Jabulani bola = new Jabulani("Branco",69.0,"poliuretano artificial","Brazuca");

        bola.trocarCor("laranja");
        bola.mostrarCor();
    }
}
