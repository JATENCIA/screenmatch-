package com.atencia.screenmatch.data;


import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class DataApiOmdb {

    public static String searchMovies(String movie) throws IOException, InterruptedException {


        String encodedMovieName = URLEncoder.encode(movie, StandardCharsets.UTF_8);

        Properties properties = new Properties();
        properties.load(new FileInputStream("config/secrets/properties"));
        String secretKey = properties.getProperty("SECRET_KEY");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t=" + encodedMovieName + "&apikey=" + secretKey)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();

    }
}
