package br.com.zup.exemplos.polimorfismo.exemplo1;

public class Main {
    public static void main(String[] args) {
        Protagonista protagonista = new Protagonista("Adam Sandler", "Cardiologista", 4000, 100, 1000);
        Figurante figurante = new Figurante("Robson", "As pessoas que correm no metrô", 500,0);

        protagonista.setImposto(1000);
        figurante.setImposto(80);
        double salarioLiquido = protagonista.calcularSalario();
        double salarioLiquidoFigurante = figurante.calcularSalario();

        System.out.println(salarioLiquido);
        System.out.println(salarioLiquidoFigurante);
        System.out.println(figurante.getIngressosGratis());
    }
}
