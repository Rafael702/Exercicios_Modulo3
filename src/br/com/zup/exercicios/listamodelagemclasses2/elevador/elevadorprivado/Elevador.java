package br.com.zup.exercicios.listamodelagemclasses2.elevador.elevadorprivado;

public class Elevador {
    private int andarAtual = 0;
    private int qtdPessoasPresentes;
    private int capacidade;
    private int totalDeAndares;

    public Elevador(int andarAtual, int qtdPessoasPresentes, int capacidade, int totalDeAndares) {
        this.andarAtual = andarAtual;
        this.totalDeAndares = totalDeAndares;
        this.capacidade = capacidade;
        this.qtdPessoasPresentes = qtdPessoasPresentes;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getQtdPessoasPresentes() {
        return qtdPessoasPresentes;
    }

    public void setQtdPessoasPresentes(int qtdPessoasPresentes) {
        this.qtdPessoasPresentes = qtdPessoasPresentes;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
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
            System.out.println("Você já está no Térreo.");
        } else {
            System.out.println("Descendo🔽");
            while (andarAtual > numeroDoAndar) {
                System.out.print(andarAtual + " ");
                andarAtual--;
                Thread.sleep(1_000);
            }
            if (andarAtual == 0) {
                System.out.println("");
                System.out.println("Você está no Térreo " + numeroDoAndar + "° andar");
            } else {
                System.out.println("");
                System.out.println("Você está no " + numeroDoAndar + "° andar");

            }
        }
    }
}


