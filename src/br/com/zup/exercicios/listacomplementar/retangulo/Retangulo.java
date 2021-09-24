package br.com.zup.exercicios.listacomplementar.retangulo;

public class Retangulo {
    private double base, altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mudarValorDosLados(double valorLado, int baseOuAltura) {
        if (baseOuAltura == 1) {
            base = valorLado;
        } else if (baseOuAltura == 2) {
            altura = valorLado;
        } else {
            base = valorLado;
            altura = valorLado;
        }
    }

    public String valorDosLados() {
        return "Base: " + base + "\nAltura:" + altura;
    }

    public void calculoAreaEPerimetro() {
        double area = base * altura;
        double perimetro = base + altura;

        System.out.println("Área do Retangulo: " + area);
        System.out.println("Perímetro do Retangulo: " + perimetro);
    }
}
