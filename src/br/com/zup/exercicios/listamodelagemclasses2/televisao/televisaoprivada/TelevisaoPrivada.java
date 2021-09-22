package br.com.zup.exercicios.listamodelagemclasses2.televisao.televisaoprivada;

public class TelevisaoPrivada {
    private int volume = 0;
    private int canal = 0;

    public TelevisaoPrivada(){

    }

    public TelevisaoPrivada(int volume, int canal){
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume(){

        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public int getCanal(){
        return  canal;
    }

    public void setCanal(int canal){
        this.canal = canal;
    }
}
