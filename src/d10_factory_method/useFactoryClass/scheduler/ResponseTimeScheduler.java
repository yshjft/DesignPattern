package d10_factory_method.useFactoryClass.scheduler;

import d10_factory_method.Direction;
import d10_factory_method.useFactoryClass.ElevatorManager;

public class ResponseTimeScheduler implements ElevatorScheduler{
    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
        return 1;
    }
}
