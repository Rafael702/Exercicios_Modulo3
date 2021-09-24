package br.com.zup.exemplos.modificadordeacessos.contaprivada;


import br.com.zup.exemplos.modificadordeacessos.contaprivada.conta.ContaPrivada;

public class Main {
    public static void main(String[] args) {
        ContaPrivada objeto = new ContaPrivada();

        objeto.setNome("Rafael Santos de Almeida");
        objeto.setNumeroDaConta("888-8");

        objeto.extrato();

        objeto.depositar(800);

        objeto.extrato();

    }
}
