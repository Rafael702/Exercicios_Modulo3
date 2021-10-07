package br.com.zup.exercicios.projetinho.aula0610;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

    //Valdiar o email (Verificar se tem o @)
    public static void validarEmail(String email) throws Exception{
        if(!email.contains("@")){
            throw new Exception("E-mail inválido");
        }
    }

    //Verificar se o email existe (Percorrer a Lista)
    public static void verificarSeOEmailExiste(String email) throws Exception{
        for(Consumidor consumidorReferencia: consumidores){
            if(consumidorReferencia.getEmail().equals(email)){
                throw new Exception("Este E-mail já está cadastrado");
            }
        }
    }

    public static Consumidor cadastrarConsumidor(String nome, String email) throws Exception{
        validarEmail(email);
        verificarSeOEmailExiste(email);
        Consumidor consumidor = new Consumidor(nome,email);
        consumidores.add(consumidor);
        return consumidor;
    }

    public static void exibirConsumidores(){
        for(Consumidor referencia : consumidores){
            System.out.println(referencia);
        }
    }

    public static Consumidor pesquisarConsumidorPorEmail(String email) throws Exception{
        for(Consumidor consumidorReferencia: consumidores){
            if(consumidorReferencia.getEmail().equals(email)){
                return consumidorReferencia;
            }

        }
        //Estourar exceção
        throw new Exception("Consumidor não cadastrado no sistema");
    }
}
