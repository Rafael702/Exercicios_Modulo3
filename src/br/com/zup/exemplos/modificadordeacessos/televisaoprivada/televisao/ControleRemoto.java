package br.com.zup.exemplos.modificadordeacessos.televisaoprivada.televisao;

public class ControleRemoto {
    TelevisaoPrivada tv;

    public ControleRemoto(TelevisaoPrivada tv) {
        this.tv = tv;
    }

    public void aumentarVolume(){
        int volumeAumentado = tv.getVolume() + 1;
        tv.setVolume(volumeAumentado);
    }

    public void diminuirVolume(){
        int volumeDiminuido = tv.getVolume() - 1;
        tv.setVolume(volumeDiminuido);
    }

    public void aumentarCanal(){
        int novoCanal = tv.getCanal() + 1;
        tv.setCanal(novoCanal);
    }

    public void diminuirCanal(){
        int novoCanal = tv.getCanal() - 1;
        tv.setCanal(novoCanal);
    }

    public void trocarCanal(int novoCanal){
        tv.setCanal(novoCanal);
    }

//    public void mostrarDados(){
//        System.out.println("Canal: " + tv.getCanal());
//        System.out.println("Volume: " + tv.getVolume());
//    }
    //Outra forma:
    public String retornaDados(){
        return "Canal: " + tv.getCanal() +
                "Volume" + tv.getVolume();
    }

}
