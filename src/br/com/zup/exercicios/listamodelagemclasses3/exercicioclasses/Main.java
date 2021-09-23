package br.com.zup.exercicios.listamodelagemclasses3.exercicioclasses;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("FarmaCon","Rua Fonte Seca", "(11)99560-9090", 1000, 500);
        Colaborador colab = new Colaborador("Afonso","Rua Fonte Seca","(11)9907-5670",1,1045,10);

        System.out.println("R$" + fornecedor.obterSaldo());
        System.out.println("R$" + colab.calcularSalario());

    }
}
