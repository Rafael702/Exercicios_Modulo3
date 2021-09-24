package br.com.zup.exemplos.exemploclasses.exemploanimal;

public class Main {
    public static void main(String[] args) {
        Baleia  freewilly = new Baleia(80, 500, "fundo do mar", "Orca");
        Cachorro cachorro = new Cachorro("Bob","puddle", "pequeno porte",2, 50 );
        Gato frajola = new Gato("persa", "branca", 8, 50);
        Papagaio loro = new Papagaio("verde",10, true, 70 );

        cachorro.mostrarDados();
    }
}
