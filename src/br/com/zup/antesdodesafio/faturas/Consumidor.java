package br.com.zup.antesdodesafio.faturas;

public class Consumidor {
    private String nome;
    private String email;
    private TipoConsumidor tipoConsumidor;

    public Consumidor() {
    }

    public Consumidor(String nome, String email,TipoConsumidor tipoConsumidor) {
        this.nome = nome;
        this.email = email;
        this.tipoConsumidor = tipoConsumidor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoConsumidor getTipoConsumidor() {
        return tipoConsumidor;
    }

    public void setTipoConsumidor(TipoConsumidor tipoConsumidor) {
        this.tipoConsumidor = tipoConsumidor;
    }

    @Override
    public String toString() {
    StringBuilder retorno  = new StringBuilder();
    retorno.append(" Nome do Consumidor: " + nome);
    retorno.append("\n" + "|   E-mail do Consumidor: " + email);
    retorno.append("\n" + "|   Tipo Consumidor: " + tipoConsumidor);
    return  retorno.toString();
    }
}
