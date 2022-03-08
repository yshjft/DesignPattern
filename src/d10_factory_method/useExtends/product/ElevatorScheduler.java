package d10_factory_method.useExtends.product;

import d10_factory_method.Direction;
import d10_factory_method.useExtends.creator.ElevatorManager;

public interface ElevatorScheduler {
    int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
