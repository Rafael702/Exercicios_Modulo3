package br.com.zup.antesdodesafio.faturas;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;

            try {
                Sistema.executar();
            } catch (Exception erro) {
                System.out.println(erro.getMessage());
            }
    }
}
