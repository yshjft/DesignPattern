package d2_strategy;

import d2_strategy.context.Robot;
import d2_strategy.strategy.attack.MissileStrategy;
import d2_strategy.strategy.attack.PunchStrategy;
import d2_strategy.strategy.moving.FlyingStrategy;
import d2_strategy.strategy.moving.WalkingStrategy;

// client
public class Main {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");

        taekwonV.setMovingStrategy(new WalkingStrategy());
        taekwonV.setAttackStrategy(new MissileStrategy());
        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());

        System.out.println("== "+taekwonV.getName()+" ==");
        taekwonV.move();
        taekwonV.attack();

        System.out.println("== "+taekwonV.getName()+" ==");
        atom.move();
        atom.attack();
    }
}
