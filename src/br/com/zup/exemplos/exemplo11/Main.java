package br.com.zup.exemplos.exemplo11;

public class Main {
    public static void main(String[] args) {
        try{
            Sistema.cadastrarAlunos();
            Sistema.cadastrarAlunos();
            ServicoAluno.listaDeAlunos();
        }catch (Exception erro){
            System.out.println(erro.getMessage());
        }
    }
}
