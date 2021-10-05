package br.com.zup.exemplos.exemplo10.carro.carro;

public class Carro extends Veiculo{
    private int numeroDePortas;

    public Carro(String placa, String cor, String modelo, String marca) {
        super(placa, cor, modelo, marca);
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String toString() {
        return "Carro{" + super.toString() +
                "numeroDePortas=" + numeroDePortas +
                '}';
    }
}
