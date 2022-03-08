package d10_factory_method.useExtends.creator;

import d10_factory_method.Direction;
import d10_factory_method.useExtends.ElevatorController;
import d10_factory_method.useExtends.product.ElevatorScheduler;

import java.util.ArrayList;
import java.util.List;

public abstract class ElevatorManager {
    private List<ElevatorController> controllers;

    public ElevatorManager(int controllerCount) {
        controllers = new ArrayList<ElevatorController>(controllerCount);
        for(int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i+1);
            controllers.add(controller);
        }
    }

    protected abstract ElevatorScheduler getScheduler();

    public void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler = getScheduler();
        System.out.println(scheduler);

        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
