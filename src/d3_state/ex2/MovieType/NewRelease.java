package d3_state.ex2.MovieType;

public class NewRelease implements MovieType{
    @Override
    public double getCharge(int daysRented) {
        double result = 0;

        result += daysRented * 3;

        return result;
    }
}
