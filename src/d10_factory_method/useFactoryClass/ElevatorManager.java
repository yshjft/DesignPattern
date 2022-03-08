package d10_factory_method.useFactoryClass;

import d10_factory_method.Direction;
import d10_factory_method.useFactoryClass.scheduler.*;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
    private List<ElevatorController> controllers;
    private SchedulingStrategyID strategyID;

    public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID) {
        controllers = new ArrayList<ElevatorController>(controllerCount);
        for(int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i+1);
            controllers.add(controller);
        }

        this.strategyID = strategyID;
    }

    public void setStrategyID(SchedulingStrategyID strategyID) {
        this.strategyID = strategyID;
    }

    public void requestElevator(int destination, Direction direction) {
        // factory 클래스를 이용하여 객체 생성 처리
        ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
        System.out.println(scheduler);

        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
