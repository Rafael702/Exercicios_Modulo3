package br.com.zup.exercicios.listamodelagemclasses.cartaocredito;

public class CartãoCredito {
    int limite;
    int saldoDaFatura;
    String nomeDoCliente;


    public  CartãoCredito(int limite, String nomeDoCliente){
        this.limite = limite;
        this.nomeDoCliente = nomeDoCliente;
    }

    public void aumentarLimite(int aumento){
        limite += aumento;
    }

    public void diminuirLimite(){
        limite -= saldoDaFatura;

    }

    public void realizarCompra(int valorCompra){
        if(limite < valorCompra){
            System.out.println("Compra negada. Valor acima do limite " + limite);
        }else{
            System.out.println("Compra feita com sucesso. Valor de " + valorCompra);
            saldoDaFatura += valorCompra;
        }
    }

    public void imprimirFatura(){

        System.out.println("|-----------------------------Fatura----------------------------|");
        System.out.println("|Prezado, " + nomeDoCliente + "|");
        System.out.println("|Total: R$" + saldoDaFatura + "|");
        System.out.println("-----------------------------------------------------------------");
    }


}
