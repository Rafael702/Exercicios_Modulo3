package br.com.zup.exemplos.exemploclasses.conta;

public class ContaCorrente {
    String nomeDoTitular;
    String cpf;
    String agencia;
    String numeroDaConta;
    double emprestimo = 900;
    double saldo = 0;

    public ContaCorrente(String nomeDoTitular, String cpf, String agencia, String numeroDaConta) {
        this.nomeDoTitular = nomeDoTitular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
    }

    public void mostrarDados() {
        System.out.println("Nome do titular: " + nomeDoTitular);
        System.out.println("CPF do titular: " + cpf);
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta do titular: " + numeroDaConta);
        System.out.println("Empréstimo: " + emprestimo);
        System.out.println("O saldo da conta é: " + saldo);
    }

    public void depositar(double valorDepositado) {

        saldo += valorDepositado;
    }

    public void sacar(double valorSacado) {

        saldo -= valorSacado;
    }

    public String solicitaEmprestimo(double valor) {
        if (valor > emprestimo) {
            return "Este limite não está aprovado.";
        } else {
            depositar(valor);
            liberaEmprestimo(valor);
            return "Este limite está aprovada";
        }
    }

    public void liberaEmprestimo(double valor) {
        emprestimo += valor;
    }
}
