package br.com.zup.exemplos.exemplo11;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.setCpf("7327432-09");
        aluno1.setNome("Rafa");
        aluno1.setTurno(Turno.DIURNO);
        aluno1.setNivel(Nivel.DOUTORADO);
        System.out.println(aluno1.toString());
    }
}
