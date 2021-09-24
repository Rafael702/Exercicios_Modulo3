package br.com.zup.exemplos.exemploclasses.elevador;

public class Elevador {
    int andarAtual = 0;
    int qtdPessoasPresentes;
    int capacidade;
    int totalDeAndares;

    public Elevador(int andarAtual, int qtdPessoasPresentes, int capacidade, int totalDeAndares) {
        this.andarAtual = andarAtual;
        this.totalDeAndares = totalDeAndares;
        this.capacidade = capacidade;
        this.qtdPessoasPresentes = qtdPessoasPresentes;
    }

    public void entra(int qtdPessoas) {
        int totalDeViajantes = qtdPessoas + qtdPessoasPresentes;

        if (totalDeViajantes > capacidade) {
            System.out.println("Quantidade de pessoas que excedeu " + (totalDeViajantes - capacidade));
        } else {
            qtdPessoasPresentes = totalDeViajantes;
            System.out.println("Quantidade de pessoas no elevador: " + qtdPessoasPresentes);
        }
    }

    public void sai(int qtdPessoas) {
        int totalDeViajantes = qtdPessoasPresentes - qtdPessoas;
        if (totalDeViajantes < 0) {
            System.out.println("O elevador está vazio. ");
        } else {
            qtdPessoasPresentes = totalDeViajantes;

        }
    }

    public void sobe(int numeroDoAndar) throws Exception {
        if (numeroDoAndar > totalDeAndares) {
            System.out.println("Você já está no último andar.");
        } else {
            System.out.println("Subindo🔼");
            while (andarAtual < numeroDoAndar) {
                System.out.print(andarAtual + " ");
                andarAtual++;
                Thread.sleep(1_000);
            }
            System.out.println("");
            System.out.println("Você está no " + numeroDoAndar + "° andar");
        }
    }

    public void desce(int numeroDoAndar) throws Exception {
        if (andarAtual == 0) {
            System.out.println("Você já está no térreo.");
        } else {
            System.out.println("Descendo🔽");
            while (andarAtual > numeroDoAndar) {
                System.out.print(andarAtual + " ");
                andarAtual--;
                Thread.sleep(1_000);
            }
            System.out.println("");
            System.out.println("Você está no " + numeroDoAndar + "° andar");
        }
    }
}


