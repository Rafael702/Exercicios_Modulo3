package br.com.zup.exercicios.modelagemdeclasses.inimigos;

public class Rasteiros extends Inimigos{
    private double danoEspinhos;

    public Rasteiros() {

    }

    public Rasteiros(String nome, double vida, double danoEspinhos) {
        super(nome, vida);
        this.danoEspinhos = danoEspinhos;
    }

    public double getDanoEspinhos() {
        return danoEspinhos;
    }

    public void setDanoEspinhos(double danoEspinhos) {
        this.danoEspinhos = danoEspinhos;
    }

    public double aplicarDanos(){
        return danoEspinhos;
    }
}
