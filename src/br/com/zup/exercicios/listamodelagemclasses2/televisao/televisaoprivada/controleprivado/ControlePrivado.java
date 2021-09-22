package br.com.zup.exercicios.listamodelagemclasses2.televisao.televisaoprivada.controleprivado;

import br.com.zup.exercicios.listamodelagemclasses2.televisao.televisaoprivada.TelevisaoPrivada;

public class ControlePrivado {
    private TelevisaoPrivada tv;
    String volume = (")");

    public ControlePrivado() {

    }

    public ControlePrivado(TelevisaoPrivada tv) {
        this.tv = tv;
    }

    public TelevisaoPrivada getTv() {
        return tv;
    }

    public void setTv(TelevisaoPrivada tv) {
        this.tv = tv;
    }

    public void aumentarVolume(int nivelVolume) throws Exception {
            System.out.print("🔈");
            while (tv.getVolume() < nivelVolume) {
                System.out.print(volume);
                tv.setVolume(tv.getVolume() + 1);
                Thread.sleep(1_000);
            }
            volume = volume;
            System.out.println(tv.getVolume());
        }


    public void diminuirVolume(int nivelVolume) throws Exception {
            System.out.print("🔈");
            while (tv.getVolume() > nivelVolume) {
                System.out.print(volume.replace(")", "-"));
                tv.setVolume(tv.getVolume() - 1);
                Thread.sleep(1_000);
            }
            System.out.println(tv.getVolume());
        }


    public void aumentarCanal(int canalEscolhido) throws Exception {
        if (tv.getCanal() < canalEscolhido) {
            while (tv.getCanal() < canalEscolhido) {
                System.out.print(tv.getCanal() + " ");
                tv.setCanal(tv.getCanal() + 1);
                Thread.sleep(1_000);
            }
            System.out.println();
            System.out.println("Canal: " + tv.getCanal());
        }
    }

    public void diminuirCanal(int canalEscolhido) throws Exception {
        if (tv.getCanal() > canalEscolhido) {
            while (tv.getCanal() > canalEscolhido) {
                System.out.print(tv.getCanal() + " ");
                tv.setCanal(tv.getCanal() - 1);
                Thread.sleep(1_000);
            }
            System.out.println();
            System.out.println("Canal: " + tv.getCanal());
        } else {
            System.out.println("------------------------");
            System.out.println("Canal: " + tv.getCanal());
        }
    }

    public void trocarCanal(int numeroCanal) {
        this.tv.setCanal(numeroCanal);
        System.out.println("--------------");
        System.out.println("Canal: " + tv.getCanal());
    }

    public void consultaCanalEVolume() {
        System.out.println("--------------");
        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());
        System.out.println("--------------");

    }


}
