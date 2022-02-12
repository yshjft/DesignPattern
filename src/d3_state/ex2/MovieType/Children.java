package d3_state.ex2.MovieType;

public class Children implements MovieType{
    @Override
    public double getCharge(int daysRented) {
        double result = 0;

        result += 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;

        return result;
    }
}
