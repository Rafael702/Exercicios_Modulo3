package br.com.zup.exemplos.modificadordeacessos.contaprivada.conta;

public class ContaPrivada {
    private String nome;
    private String numeroDaConta;
    private double saldo;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNumeroDaConta(){
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saque(double saque){
        this.saldo = saldo;
    }
    public void depositar(double depositar){
        this.saldo += depositar;
    }

    public void extrato(){
        System.out.println("Nome do correntista: " + nome);
        System.out.println("Numero da conta: " + numeroDaConta);
        System.out.println("Saldo da conta: R$" + saldo);
    }

}
