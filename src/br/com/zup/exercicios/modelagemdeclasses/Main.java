package br.com.zup.exercicios.modelagemdeclasses;

import br.com.zup.exercicios.modelagemdeclasses.herois.Guerreiros;
import br.com.zup.exercicios.modelagemdeclasses.herois.Magos;
import br.com.zup.exercicios.modelagemdeclasses.inimigos.Rasteiros;

public class Main {
    public static void main(String[] args) {
        Magos maguinho = new Magos("",15,20);
        Guerreiros guerreiro = new Guerreiros("", 30, 30);
        Rasteiros espinhoso = new Rasteiros("",45,10);

        maguinho.trocarNome("Lord");
        guerreiro.trocarNome("John");
        espinhoso.trocarNome("Venom");

        System.out.println("Danos recebidos " + espinhoso.getNome() + " " + espinhoso.receberDano(maguinho.aplicarMagia()));
        System.out.println("Vida: " + espinhoso.exibirVida());
        System.out.println("Danos recebidos " + espinhoso.getNome() + " " + espinhoso.receberDano(maguinho.aplicarMagia()));
        System.out.println("Vida: " + espinhoso.exibirVida());
        System.out.println("Danos recebidos " + maguinho.getNome() + " " + maguinho.receberDano(espinhoso.aplicarDanos()));
        System.out.println("Vida: " + maguinho.exibirVida());
        System.out.println("Danos recebidos " + maguinho.getNome() + " " + maguinho.receberDano(espinhoso.aplicarDanos()));
        System.out.println("Vida: " + maguinho.exibirVida());


    }
}
