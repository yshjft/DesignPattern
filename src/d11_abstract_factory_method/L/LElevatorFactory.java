package d11_abstract_factory_method.L;

import d11_abstract_factory_method.absProduct.Door;
import d11_abstract_factory_method.factory.ElevatorFactory;
import d11_abstract_factory_method.absProduct.Motor;

public class LElevatorFactory extends ElevatorFactory {
    @Override
    public Motor createMotor() {
        return new LMotor();
    }

    @Override
    public Door createDoor() {
        return new LDoor();
    }
}
