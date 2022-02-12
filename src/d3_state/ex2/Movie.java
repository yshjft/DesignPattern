package d3_state.ex2;

import d3_state.ex2.MovieType.MovieType;
import d3_state.ex2.MovieType.Regular;

public class Movie {
    private MovieType movieType;

    public Movie() {
        this.movieType = new Regular();
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public double getCharge(int daysRented) {
        return movieType.getCharge(daysRented);
    }
}
