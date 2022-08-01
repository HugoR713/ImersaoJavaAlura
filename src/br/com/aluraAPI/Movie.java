package br.com.aluraAPI;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class Movie {
    public static void main(String[] args) throws Exception{

        // fazer uma conexão HTTP e buscar os top 250 filmes

        String url = "https://alura-imdb-api.herokuapp.com/movies";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();

        // pegar só os dados que interessam (Titulo,img,classificação)

        var parser = new JsonParser();
        List<Map<String , String>> listaDeFilmes = parser.parse(body);
        //System.out.println(listaDeFilmes.size());


        //exibir e manipular os dados.

        for(Map<String, String> filme : listaDeFilmes){
            System.out.println("Filme: " + filme.get("title"));
            //System.out.println();
            System.out.println("Imagem: " + filme.get("image"));
            //System.out.println();
            System.out.println("Avaliação: " + filme.get("imDbRating"));
            System.out.println();


        }




    }


}
