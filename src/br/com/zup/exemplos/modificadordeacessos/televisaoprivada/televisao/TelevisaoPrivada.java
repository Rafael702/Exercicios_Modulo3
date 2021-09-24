package br.com.zup.exemplos.modificadordeacessos.televisaoprivada.televisao;

public class TelevisaoPrivada {
    private int volume;
    private int canal;

    public TelevisaoPrivada(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void passarVolume() {
        canal++;
    }

    public void voltarVolume() {
        canal--;
    }

    public void trocarCanal(int canal){
        this.canal = canal;
    }


}
