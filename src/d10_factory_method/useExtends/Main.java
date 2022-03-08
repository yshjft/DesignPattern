package d10_factory_method.useExtends;

import d10_factory_method.Direction;
import d10_factory_method.useExtends.creator.ElevatorManager;
import d10_factory_method.useExtends.creator.ElevatorManagerWithDynamicScheduling;
import d10_factory_method.useExtends.creator.ElevatorManagerWithResponseTimeScheduling;
import d10_factory_method.useExtends.creator.ElevatorManagerWithThroughputScheduling;

public class Main {
    public static void main(String[] args) {
        ElevatorManager emWithResponseTimeScheduler = new ElevatorManagerWithResponseTimeScheduling(2);
        emWithResponseTimeScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithThroughputScheduler  = new ElevatorManagerWithThroughputScheduling(2);
        emWithThroughputScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithDynamicScheduler = new ElevatorManagerWithDynamicScheduling(2);
        emWithDynamicScheduler.requestElevator(10, Direction.UP);

    }
}