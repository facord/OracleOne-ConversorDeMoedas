package br.com.alura.conversorDeMoedas.modelos;

import java.io.IOException;

public class ConverterTaxa {
    public Conversao ConversaoMoedas(String moeda_original, String moeda_conversao,double valor) {
        try {
            ConsultaConversao consultaMoedas = new ConsultaConversao();
            Conversao novaConversao;
            novaConversao = consultaMoedas.buscaConversao(moeda_original, moeda_conversao, valor);
            return novaConversao;
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Erro! Finalizando a aplicação.");
        }
        return null;
    }
}
