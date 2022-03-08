package d10_factory_method.useExtends.product;

import d10_factory_method.Direction;
import d10_factory_method.useExtends.creator.ElevatorManager;

public class ResponseTimeScheduler implements ElevatorScheduler {
    public static ResponseTimeScheduler getInstance() {
        return new ResponseTimeScheduler();
    }

    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
        return 1;
    }
}
