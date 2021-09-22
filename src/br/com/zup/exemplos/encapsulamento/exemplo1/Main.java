package br.com.zup.exemplos.encapsulamento.exemplo1;

public class Main {
    public static void main(String[] args) {
        Professor objeto = new Professor("Rafael",1500,"453656-90","687617823-09","Psicologia" );
        Inspetor objeto2 = new Inspetor("Robson", 1000, "78937432-9", "092348534-87", "Quadra");
        TecnicoAdministrativo objeto3 = new TecnicoAdministrativo("Vanderlei", 1700, "84734534-09", "742723474-09", "Comercial");


        System.out.println(objeto.getNome());
    }
}
