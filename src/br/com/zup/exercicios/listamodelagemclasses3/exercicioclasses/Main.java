package br.com.zup.exercicios.listamodelagemclasses3.exercicioclasses;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("FarmaCon","Rua Fonte Seca", "(11)99560-9090", 1000, 500);
        Colaborador colab = new Colaborador("Afonso","Rua Fonte Seca","(11)9907-5670",1,1045,10);
        Administrador adm = new Administrador("Rodrigo","Rua Fonte Seca","(11)99854-4352",2,1500,50,150);

        System.out.println("Saldo do Fornecedor " +  fornecedor.getNome() +": R$" + fornecedor.obterSaldo());
        System.out.println("Salário do colaborador "+ colab.getNome() + ": R$" + colab.calcularSalario());
        System.out.println("Salário do administrador " + adm.getNome() + ": R$" + adm.calcularSalario());

    }
}
