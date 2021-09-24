package br.com.zup.exemplos.encapsulamento.exemplo2;

public class Main {
    public static void main(String[] args) {
        Guerreiros guerreiro = new Guerreiros("Thor", "Armadura", 100,"martelo");
        Voadores inimigoVoador = new Voadores("Anivia", "azul","gelo", 800,50);

        System.out.println(guerreiro.getVida());

        int danoAplicado = inimigoVoador.aplicaDano();
        guerreiro.perderVida(danoAplicado);

        int danoDoGuerreiro = guerreiro.aplicaDano();
        inimigoVoador.perderVida(danoDoGuerreiro);
        System.out.println(guerreiro.getVida());

//        if(guerreiro.getVida() <= 0){
//            System.out.println("Você morreu!");
//        }else{
//            System.out.println("Você tomou " + inimigoVoador.getDano() + " de dano.");
//            System.out.println("E você têm " + guerreiro.getVida() + " de vida.");
//        }
    }
}
