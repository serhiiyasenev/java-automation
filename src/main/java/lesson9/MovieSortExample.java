package lesson9;

import java.util.*;

public class MovieSortExample {

    public static void main(String[] args) {

        List<Movie> list = new ArrayList<>();
        list.add(new Movie("A film", 2.4));
        list.add(new Movie("B film", 2.1));
        list.add(new Movie("C film", 2.2));
        list.add(new Movie("D film", 2.5));
        list.add(new Movie("E film", 2.3));
        list.add(new Movie("F film", 2.0));

        Collections.sort(list);
        System.out.println(list);
    }
}