package br.com.zup.antesdodesafio.faturas;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

   public static List<TipoConsumidor> mostrarTiposDeConsumidor(){
       List<TipoConsumidor> tiposDeConsumidor = new ArrayList<>();

       for(TipoConsumidor tipoConsumidor: TipoConsumidor.values()){
              tiposDeConsumidor.add(tipoConsumidor);
       }
        return tiposDeConsumidor;
   }

    public static TipoConsumidor validarTipoDeConsumidor(String novoTipoConsumidor) throws Exception {
       for (TipoConsumidor tipoConsumidorReferencia : TipoConsumidor.values()) {
           String tirandoEspaco = novoTipoConsumidor.replaceAll("\\s+", "");
               if (tirandoEspaco.equalsIgnoreCase(String.valueOf(tipoConsumidorReferencia))) {
                   return tipoConsumidorReferencia;
               }
           }
        throw new Exception("Tipo de Consumidor não encontrado");
           
    }

    public static Consumidor cadastrarConsumidor(String nome, String tipoConsumidor) throws Exception {
        TipoConsumidor tipo = validarTipoDeConsumidor(tipoConsumidor);
        Consumidor consumidor = new Consumidor(nome, tipo);

        consumidores.add(consumidor);
        return consumidor;
    }


}

