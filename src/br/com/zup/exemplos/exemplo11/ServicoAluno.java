package br.com.zup.exemplos.exemplo11;

import java.util.ArrayList;
import java.util.List;

public class ServicoAluno {
    private static List<Aluno> alunos = new ArrayList<>();

    public static List<Turno> mostrarTurnos(){
        List<Turno> turnos = new ArrayList<>();

        for(Turno turnoReferencia: Turno.values()){
            turnos.add(turnoReferencia);
        }
        return turnos;
    }

    public static Turno validarTurno(String turno) throws Exception{
    for(Turno turnoReferencia: Turno.values()){
        if(turno.equalsIgnoreCase(String.valueOf(turnoReferencia))){
            return turnoReferencia;
        }
    }
    throw new Exception ("Turno não encontrado");
    }

    public static Aluno cadastrarAlunos(String nome, String cpf, String turnoRecebido) throws Exception{
        Turno turno  = validarTurno(turnoRecebido);

        Aluno aluno = new Aluno(nome,cpf,turno);
        alunos.add(aluno);
        return aluno;
    }

    public static void listaDeAlunos(){
        for(Aluno aluno:alunos){
            System.out.println(aluno);
        }
    }
}
