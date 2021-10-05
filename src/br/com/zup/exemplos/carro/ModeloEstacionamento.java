package br.com.zup.exemplos.exemplo10.carro;

//Faça um sistema que gerencie um estacionamento
//O sistema deve permitir adicionar, remover ou consultar se um carro já está cadastrado
//O sistema deve exibir os carros do estacionamento.

public interface ModeloEstacionamento {
    //implementar adiciona carro
    public abstract void adicionarCarro(Carro novoCarro);
    //Remover carro
    public abstract void removerCarro(String placa);
    //Consultar se o carro está no estacionamento
    public abstract Carro consultarCarro(String placa);

}
