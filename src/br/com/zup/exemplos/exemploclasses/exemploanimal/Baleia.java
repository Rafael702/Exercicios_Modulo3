package br.com.zup.exemplos.exemploclasses.exemploanimal;

public class Baleia {
    double tamanho;
    double peso;
    String habitat;
    String especie;

    public  Baleia(double tamanho, double peso, String habitat, String especie){
        this.tamanho = tamanho;
        this.peso = peso;
        this.habitat = habitat;
        this.especie = especie;
    }

    public void mostrarDados(){
        System.out.println("O tamanho é: " + tamanho);
        System.out.println("O peso  é: " + peso);
        System.out.println("O habitat é: " + habitat);
        System.out.println("A espécie é: " + especie);
    }


}
