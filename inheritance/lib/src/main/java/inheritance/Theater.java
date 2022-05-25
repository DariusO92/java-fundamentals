package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
public class Theater {
    public String name;
    public String movieTitle;
   // public  String ArrayList<Movie> movie = new ArrayList<>();
    public LinkedList<String> movies = new LinkedList<>();

    public Theater(String name, String movieTitle) {
        this.name = name;
        this.movieTitle = movieTitle;
    }

    public void addMovie(String movieTitle){
        this.movies.add(movieTitle);

    }

    public void removeMovie(String MovieTitle){
        this.movies.remove(movieTitle);
    }
}
