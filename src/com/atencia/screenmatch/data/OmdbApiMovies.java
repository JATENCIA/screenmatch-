package com.atencia.screenmatch.data;

import com.atencia.screenmatch.exeption.ConversionValueErrorExeption;
import com.atencia.screenmatch.model.Title;
import com.atencia.screenmatch.model.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.net.URLEncoder;

public class OmdbApiMovies {

    public static void requestMovies() throws IOException, InterruptedException, IllegalArgumentException {

        Scanner scanner = new Scanner(System.in);
        List<Title> titleList = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        while (true) {

            System.out.println("Please enter the name of the movie you would like to search for. : ");
            String movie = scanner.next();

            if (movie.equalsIgnoreCase("exit")) break;

            try {

                String resultJson = DataApiOmdb.searchMovies(movie);

                System.out.println(resultJson);
                TitleOmdb titleOmdb = gson.fromJson(resultJson, TitleOmdb.class);
                Title title = new Title(titleOmdb);
                System.out.println(title);

                titleList.add(title);


            } catch (NumberFormatException | ConversionValueErrorExeption exception) {
                System.out.println(exception.getMessage());
            }

            FileWriter fileWriter = new FileWriter("movies.json", false);
            fileWriter.write(gson.toJson(titleList));
            fileWriter.close();

        }

    }


}
