package lesson9;
import java.util.*;

public class MovieSortExampleSet {

    public static void main(String[] args) {

        Set<Movie> movieSet = new TreeSet<>(new MovieTitlesComparator());
        movieSet.add(new Movie("A film", 2.4));
        movieSet.add(new Movie("B film", 2.1));
        movieSet.add(new Movie("C film", 2.2));
        movieSet.add(new Movie("D film", 2.5));
        movieSet.add(new Movie("E film", 2.3));
        movieSet.add(new Movie("F film", 2.0));
        // title
        System.out.println(movieSet);
    }
}