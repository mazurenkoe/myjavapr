package lesson14;

import org.jetbrains.annotations.NotNull;

public class Movie implements Comparable {

    public double score;
    public String title;
    public int year;

    @Override
    public int compareTo(@NotNull Object o) {
        Movie m = (Movie) o;
        return (score < m.score) ? -1 : ((score == m.score) ? 0 : 1);
    }

    public Movie(String title, double score){
        this.score = score;
        this.title = title;
    }

    public Movie(String title, double score, int year){
        this.score = score;
        this.title = title;
        this.year = year;
    }
}
