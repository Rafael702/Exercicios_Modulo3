package br.com.zup.exercicios.listamodelagemclasses2.elevador;


import br.com.zup.exercicios.listamodelagemclasses2.elevador.elevadorprivado.Elevador;

public class Main {
    public static void main(String[] args) throws Exception {
        Elevador objeto = new Elevador(0,0,10,12);

        System.out.println(objeto.getQtdPessoasPresentes());
        objeto.entra(2);

        objeto.sobe(5);
        objeto.sai(1);
        System.out.println("Quantidade de pessoas presentes no elevador: " + objeto.getQtdPessoasPresentes());

        objeto.desce(1);
        objeto.entra(1);
        System.out.println("Quantidade de pessoas presentes no elevador: " + objeto.getQtdPessoasPresentes());

        objeto.sobe(3);
        objeto.sai(5);
        System.out.println("Quantidade de pessoas presentes no elevador: " + objeto.getQtdPessoasPresentes());

        objeto.desce(0);
        objeto.desce(0);

    }
}
