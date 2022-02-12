package d3_state.ex2;

import d3_state.ex2.MovieType.Children;
import d3_state.ex2.MovieType.NewRelease;
import d3_state.ex2.MovieType.Regular;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        Regular regular = new Regular();
        NewRelease newRelease = new NewRelease();
        Children children = new Children();

        movie.setMovieType(children);
        System.out.println(movie.getCharge(3));
        movie.setMovieType(regular);
        System.out.println(movie.getCharge(3));
        movie.setMovieType(newRelease);
        System.out.println(movie.getCharge(3));
    }
}
