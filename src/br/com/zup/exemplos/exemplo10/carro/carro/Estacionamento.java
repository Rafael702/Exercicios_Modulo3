package br.com.zup.exemplos.exemplo10.carro.carro;

//Faça um sistema que gerencie um estacionamento
//O sistema deve permitir adicionar, remover ou consultar se um carro já está cadastrado
//O sistema deve exibir os carros do estacionamento.

import br.com.zup.exemplos.exemplo10.carro.carro.Carro;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento implements ModeloEstacionamento{
    private List<Carro> carros = new ArrayList<>();

    @Override
    public void adicionarCarro(Carro novoCarro) {
        carros.add(novoCarro);
    }

    public void mostrarLista(){
        for(Carro referencia: carros){
            System.out.println(referencia);
        }
    }

    @Override
    public void removerCarro(String placa) {
        Carro carroASerDeletado = null;
        for(Carro referencia: carros){
            if(referencia.getPlaca().equals(placa)){
                carroASerDeletado = referencia;
                System.out.println("Carro encontrado e deletado com sucesso.");
            }else{
                System.out.println("Carro não encontrado.");
            }
        }
        carros.remove(carroASerDeletado);
    }

    @Override
    public Carro consultarCarro(String placa) {
        Carro carroDeRetorno = null;
        for(Carro referencia: carros){
            if(referencia.getPlaca().equals(placa)){
                carroDeRetorno = referencia;
                System.out.println("Carro Encontrado");
            }else{
                System.out.println("Carro não encontrado.");
            }
        }
        return carroDeRetorno;
    }


}
