package d10_factory_method.useFactoryClass;

import d10_factory_method.Direction;
import d10_factory_method.useFactoryClass.scheduler.SchedulingStrategyID;

public class Main {
    public static void main(String[] args) {
        ElevatorManager emWithResponseTimeScheduler  = new ElevatorManager(2, SchedulingStrategyID.RESPONSE_TIME);
        emWithResponseTimeScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithThroughputScheduler  = new ElevatorManager(2, SchedulingStrategyID.THROUGHPUT);
        emWithThroughputScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithDynamicScheduler = new ElevatorManager(2, SchedulingStrategyID.DYNAMIC);
        emWithDynamicScheduler.requestElevator(10, Direction.UP);
    }
}
