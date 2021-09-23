package br.com.zup.exercicios.listamodelagemclasses3.exercicioclasses;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("FarmaCon","Rua Fonte Seca", "(11)99560-9090", 1000, 500);

        System.out.println("R$" + fornecedor.obterSaldo());
    }
}
