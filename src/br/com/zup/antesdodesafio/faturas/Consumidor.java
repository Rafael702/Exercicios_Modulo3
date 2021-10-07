package br.com.zup.antesdodesafio.faturas;

public class Consumidor {
    private String nome;
    private TipoConsumidor tipoConsumidor;

    public Consumidor() {
    }

    public Consumidor(String nome, TipoConsumidor tipoConsumidor) {
        this.nome = nome;
        this.tipoConsumidor = tipoConsumidor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoConsumidor getTipoConsumidor() {
        return tipoConsumidor;
    }

    public void setTipoConsumidor(TipoConsumidor tipoConsumidor) {
        this.tipoConsumidor = tipoConsumidor;
    }

    @Override
    public String toString() {
        return "Consumidor{" +
                "nome='" + nome + '\'' +
                ", tipoConsumidor=" + tipoConsumidor +
                '}';
    }
}
