package d10_factory_method.useExtends.creator;

import d10_factory_method.useExtends.product.ElevatorScheduler;
import d10_factory_method.useExtends.product.ResponseTimeScheduler;
import d10_factory_method.useExtends.product.ThroughputScheduler;

import java.util.Calendar;

public class ElevatorManagerWithDynamicScheduling extends ElevatorManager{
    public ElevatorManagerWithDynamicScheduling(int controllerCount) {
        super(controllerCount);
    }

    @Override
    protected ElevatorScheduler getScheduler() {
        ElevatorScheduler scheduler = null;

        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if(hour < 12) scheduler = ResponseTimeScheduler.getInstance();
        else scheduler = ThroughputScheduler.getInstance();

        return scheduler;
    }
}
