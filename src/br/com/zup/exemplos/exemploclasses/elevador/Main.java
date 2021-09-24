package br.com.zup.exemplos.exemploclasses.elevador;

public class Main {
    public static void main(String[] args) throws Exception{
        Elevador objeto = new Elevador(0,8,10,12);

        System.out.println(objeto.qtdPessoasPresentes);
        objeto.entra(2);

        objeto.sobe(5);
        objeto.sai(1);
        System.out.println("Quantidade de pessoas presentes no elevador: " + objeto.qtdPessoasPresentes);

        objeto.desce(1);
        objeto.entra(1);
        System.out.println("Quantidade de pessoas presentes no elevador: " + objeto.qtdPessoasPresentes);

        objeto.sobe(3);
        objeto.sai(5);
        System.out.println("Quantidade de pessoas presentes no elevador: " + objeto.qtdPessoasPresentes);

        objeto.desce(0);
        objeto.desce(0);

    }
}
