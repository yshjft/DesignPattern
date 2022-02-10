package d2_strategy.strategy.moving;

public class FlyingStrategy implements MovingStrategy{
    @Override
    public void move() {
        System.out.println("fly");
    }
}
