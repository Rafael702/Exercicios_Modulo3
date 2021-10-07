package br.com.zup.exemplos.exemplo11;

import br.com.zup.exercicios.faculdade.Turma;

import java.util.List;
import java.util.Scanner;

public class Sistema {
    public static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner (System.in);
    }

    public static void menu(){
        System.out.println("Digite 1: Para Cadastrar um Aluno.");
    }

    public static void  menuTurnos(){
        List<Turno> turnos = ServicoAluno.mostrarTurnos();

        for (int i = 0; i < turnos.size(); i++) {
            System.out.println("Digite " + (i+ 1) + " para: " + turnos.get(i));
        }

    }

    public static Aluno cadastrarAlunos() throws Exception{
        String nome = capturarDados("Digite o nome do Aluno:").nextLine();
        String cpf = capturarDados("Digite o CPF do Aluno:").nextLine();
        menuTurnos();
        String turnos = capturarDados("Digite o turno:").nextLine();
        return ServicoAluno.cadastrarAlunos(nome,cpf,turnos);
    }

}
