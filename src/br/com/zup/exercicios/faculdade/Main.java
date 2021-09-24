package br.com.zup.exercicios.faculdade;

import java.time.Clock;

public class Main {
    public static void main(String[] args) {
        Coordenador coordenador = new Coordenador("Romeu", "301378145-09", "1234-98710", 1000);
        Professor prof = new Professor("Robson", "Tecnologia", "Filosofia", 150, 15);
        Turma turminha = new Turma("B", "10h:00");


        coordenador.adicionarProfessores(prof);

        prof.adicionarTurma(turminha);

    }
}
