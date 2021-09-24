package br.com.zup.exercicios.lista3;
/**3-Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
 * As perguntas são:
 "Telefonou para a vítima?"
 "Esteve no local do crime?"
 "Mora perto da vítima?"
 "Devia para a vítima?"
 "Já trabalhou com a vítima?"
 O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
 Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
 entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
 **/
import java.util.Scanner;

    public class List3_Exercicio3 { public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int contadorRespostas = 0;
        String resposta;
        //Exibir as perguntas e armazenar as respostas
        System.out.println("Olá, sou o agente do FBI! Vim te entrevistar. Responda as seguintes perguntas, " +
                "sendo s para sim e n para não. ");
        System.out.println("Telefonou para a vítima?");
        resposta = sc.next();
        if(resposta.equals("s")){
            contadorRespostas  = contadorRespostas + 1;
        }

        System.out.println("Esteve no local do crime?");
        resposta = sc.next();
        if(resposta.equals("s")){
            contadorRespostas  = contadorRespostas + 1;
        }

        System.out.println("Mora perto da vítima?");
        resposta = sc.next();
        if(resposta.equals("s")){
            contadorRespostas  = contadorRespostas + 1;
        }

        System.out.println("Devia para a vítima?");
        resposta = sc.next();
        if(resposta.equals("s")){
            contadorRespostas  = contadorRespostas + 1;
        }

        System.out.println("Já trabalhou com a vítima?" );
        resposta = sc.next();
        if(resposta.equals("s")){
            contadorRespostas  = contadorRespostas + 1;
        }

        switch (contadorRespostas){
            case 2:
                System.out.println("Você é um Suspeito do crime.");
                break;
            case 3: //3 ou 4
            case 4:
                System.out.println("Você é cumplice do crime.");
                break;
            case 5:
                System.out.println("Você é assasino, portanto, VOCÊ ESTÁ PRESO EM NOME DA LEI!");
                break;
            default:
                System.out.println("Você é inocente");
        }





        }
    }

