package lesson14;

import java.util.*;

public class SortExample {

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("A", 2.2));
        movies.add(new Movie("sdfsf", 2.2));
        movies.add(new Movie("fghg", 0.2));
        movies.add(new Movie("ghjghj", 8.2));
        movies.add(new Movie("ghjghj", 2.3));
        movies.add(new Movie("ghjj", 2.2));

        for (Movie movie:movies){
            System.out.println(movie);
        }

        System.out.println("Sorting");
        Collections.sort(movies);

        for (Movie movie:movies){
            System.out.println(movie);
        }

        // Сортируем фильмы по Названию
        Set<Movie> moviesSet = new TreeSet<>(new MovieTitlesComparator());
        moviesSet.add(new Movie("Z film", 1.3));
        moviesSet.add(new Movie("B film", 2.1));
        System.out.println(moviesSet);
// Сортируем фильмы по Оценке
        Set<Movie> moviesSetByScore = new TreeSet<>(new MovieScoreComparator());
        moviesSetByScore.addAll(moviesSet);
        System.out.println(moviesSetByScore);

    }
}
