package d3_state.ex2.MovieType;

public class Regular implements MovieType{
    @Override
    public double getCharge(int daysRented) {
        double result = 0;

        result += 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;

        return result;
    }
}
