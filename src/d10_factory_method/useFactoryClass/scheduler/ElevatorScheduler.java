package d10_factory_method.useFactoryClass.scheduler;

import d10_factory_method.Direction;
import d10_factory_method.useFactoryClass.ElevatorManager;

public interface ElevatorScheduler {
    public abstract int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
