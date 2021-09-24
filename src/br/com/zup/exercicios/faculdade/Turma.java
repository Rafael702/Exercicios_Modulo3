package br.com.zup.exercicios.faculdade;

import java.time.Clock;

public class Turma {
    private String serie;
    private String periodo;

    public Turma(String serie, String periodo) {
        this.serie = serie;
        this.periodo = periodo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
