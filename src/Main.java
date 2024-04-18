import com.atencia.screenmatch.data.OmdbApiMovies;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        OmdbApiMovies.requestMovies();

    }
}