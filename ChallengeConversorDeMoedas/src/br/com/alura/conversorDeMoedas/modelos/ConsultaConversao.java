package br.com.alura.conversorDeMoedas.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversao{
    public Conversao buscaConversao(String base_code, String target_code,
                                    double valor) throws IOException {
        String apiKey = "YOUR API KEY HERE";
        URI endereco =  URI.create ("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + base_code + "/" +
                target_code + "/" + valor);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversao.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
        return null;
    }
}
