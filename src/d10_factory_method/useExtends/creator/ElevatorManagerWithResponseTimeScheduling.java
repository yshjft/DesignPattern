package d10_factory_method.useExtends.creator;

import d10_factory_method.useExtends.product.ElevatorScheduler;
import d10_factory_method.useExtends.product.ResponseTimeScheduler;

public class ElevatorManagerWithResponseTimeScheduling extends ElevatorManager{
    public ElevatorManagerWithResponseTimeScheduling(int controllerCount) {
        super(controllerCount);
    }

    @Override
    protected ElevatorScheduler getScheduler() {
        ElevatorScheduler scheduler = ResponseTimeScheduler.getInstance();
        return scheduler;
    }
}
