package lesson9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MovieSortExample2 {

    public static void main(String[] args) {

        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("A film", 2.4));
        movieList.add(new Movie("B film", 2.1));
        movieList.add(new Movie("C film", 2.2));
        movieList.add(new Movie("D film", 2.5));
        movieList.add(new Movie("E film", 2.3));
        movieList.add(new Movie("F film", 2.0));
        // title
        Collections.sort(movieList, new MovieTitlesComparator());
        System.out.println("Sorting by Titles:");
        System.out.println(movieList);
        // score
        Collections.sort(movieList, new MovieScoreComparator());
        System.out.println("Sorting by Scores:");
        System.out.println(movieList);
    }
}