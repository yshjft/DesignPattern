package d10_factory_method.useExtends.creator;

import d10_factory_method.useExtends.product.ElevatorScheduler;
import d10_factory_method.useExtends.product.ThroughputScheduler;

public class ElevatorManagerWithThroughputScheduling extends ElevatorManager{
    public ElevatorManagerWithThroughputScheduling(int controllerCount) {
        super(controllerCount);
    }

    @Override
    protected ElevatorScheduler getScheduler() {
        ElevatorScheduler scheduler = ThroughputScheduler.getInstance();
        return scheduler;
    }
}
