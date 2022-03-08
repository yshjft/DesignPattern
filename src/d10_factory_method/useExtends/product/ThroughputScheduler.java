package d10_factory_method.useExtends.product;

import d10_factory_method.Direction;
import d10_factory_method.useExtends.creator.ElevatorManager;

public class ThroughputScheduler implements ElevatorScheduler{

    public static ThroughputScheduler getInstance() {
        return new ThroughputScheduler();
    }

    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
        return 0;
    }
}
