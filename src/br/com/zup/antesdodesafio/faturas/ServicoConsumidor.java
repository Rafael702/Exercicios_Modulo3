package br.com.zup.antesdodesafio.faturas;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

    public static List<Consumidor> getConsumidores() {
        return consumidores;
    }

    public static List<TipoConsumidor> mostrarTiposDeConsumidor() {
        List<TipoConsumidor> tiposDeConsumidor = new ArrayList<>();

        for (TipoConsumidor tipoConsumidor : TipoConsumidor.values()) {
            tiposDeConsumidor.add(tipoConsumidor);
        }
        return tiposDeConsumidor;
    }

    public static TipoConsumidor validarTipoDeConsumidor(String consumidorStr) throws Exception {
        try {
            String consumidorStrFormatado = consumidorStr.replaceAll("\\s+", "").toUpperCase();
            return TipoConsumidor.valueOf(consumidorStrFormatado);
        } catch (IllegalArgumentException iae) {
            throw new Exception("Tipo de Consumidor não encontrado!");
        }
    }

    public static void verificarSeEmailTemArroba(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Este E-mail não contêm @. Ex: ciclan@ciclan");
        }
    }

    public static void verificarEmail(String novoEmail) throws Exception {
        for (Consumidor consumidorReferencia : consumidores) {
            if (consumidorReferencia.getEmail().equals(novoEmail)) {
                throw new Exception("Este E-mail não pode ser cadastrado, pois está duplicado.");
            }
        }
    }

    public static Consumidor cadastrarConsumidor(String nome, String email, String tipoConsumidor) throws Exception {
        verificarSeEmailTemArroba(email);
        verificarEmail(email);
        TipoConsumidor tipo = validarTipoDeConsumidor(tipoConsumidor);

        Consumidor consumidor = new Consumidor(nome, email, tipo);

        consumidores.add(consumidor);
        return consumidor;
    }


}

