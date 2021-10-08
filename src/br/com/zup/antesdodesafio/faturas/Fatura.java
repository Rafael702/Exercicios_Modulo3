package br.com.zup.antesdodesafio.faturas;

public class Fatura {
    private Consumidor consumidor;
    private double valorPagamento;
    private String dataDeVencimento;

    public Fatura() {
    }

    public Fatura(Consumidor consumidor, double valorPagamento, String dataDeVencimento) {
        this.consumidor = consumidor;
        this.valorPagamento = valorPagamento;
        this.dataDeVencimento = dataDeVencimento;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("|  " + consumidor);
        retorno.append("\n" + "|   Valor da Fatura: R$" + valorPagamento);
        retorno.append("\n" + "|   Data De Vencimento: " + dataDeVencimento);
        return retorno.toString();
    }
}
