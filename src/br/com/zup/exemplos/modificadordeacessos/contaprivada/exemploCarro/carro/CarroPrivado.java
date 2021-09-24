package br.com.zup.exemplos.modificadordeacessos.contaprivada.exemploCarro.carro;

public class CarroPrivado {
    private String nome = "Ford Ka";
    private double peso;
    private String fabricante;
    private String cor;
    private double valor;

    public CarroPrivado() {

    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String cor() {
        return cor;
    }

    public double valor() {
        return valor;
    }

    public void setNome(String nome){
       if(nome.equals("Honda git")){
           this.nome = nome;
       }else{
           System.out.println("Digite um nome descente.");
       }
    }

}
