package d2_strategy.context;

import d2_strategy.strategy.attack.AttackStrategy;
import d2_strategy.strategy.moving.MovingStrategy;

// context
public abstract class Robot{
    private String name;
    private AttackStrategy attackStrategy;
    private MovingStrategy movingStrategy;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // setStrategy
    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    // doSomethingByStrategy
    public void attack() {
        attackStrategy.attack();
    }
    public void move() {
        movingStrategy.move();
    }
}
