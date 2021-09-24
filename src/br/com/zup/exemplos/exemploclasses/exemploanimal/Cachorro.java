package br.com.zup.exemplos.exemploclasses.exemploanimal;

public class Cachorro {
    String nome;
    String raca;
    String porte;
    double peso;
    double tamanho;

    public Cachorro(String nome,String raca, String porte, double peso, double tamanho){
        this.nome = nome;
        this.raca = raca;
        this.porte = porte;
        this.peso = peso;
        this.tamanho = tamanho;
    }

    //Métodos
    public void mostrarDados(){
        System.out.println("O nome do Cachorro é: " + nome);
        System.out.println("A raça do " + nome + " é: " + raca);
        System.out.println("O porte do " + nome + " é: " + porte);
        System.out.println("O peso do " + nome + " é: " + peso);
        System.out.println("O tamanho do " + nome + " é: " + tamanho);
    }
}
