package br.com.zup.exemplos.heranca.polimorfismo.exemplo5;

public class Main {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Vanderlei",50,100,10);
        Programador programador = new Programador("Rafael", 60, 10_000,"Java");
        Vigilante vigia = new Vigilante("Vanderlei", 30,100,20,20);

        System.out.println(administrador.calcularSalario());
        System.out.println(programador.calcularSalario());
        System.out.println(vigia.calcularSalario());
    }

}
