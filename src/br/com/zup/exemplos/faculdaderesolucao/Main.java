package br.com.zup.exemplos.faculdaderesolucao;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("André", "7866464241-09", "8765467", "Faculdade de Uberlândia", 1500f, "Mestrado", "Back-End", 25, 2);
        Coordenador coordenador = new Coordenador("Robson","1123244234-30","243454464-1","Faculdade de Uberlândia",1600);

        coordenador.adicionarProfessores(prof);
        System.out.println(coordenador);
    }
}
