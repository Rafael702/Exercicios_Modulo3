package br.com.zup.exercicios.projetinho.aula0610;

public class Main {
    public static void main(String[] args) {

        try {
            Sistema.cadastrarConsumidor();
            Sistema.cadastrarFatura();
        } catch (Exception erro){
            System.out.println(erro.getMessage());
        }
    }
}
