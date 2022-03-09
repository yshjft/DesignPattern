package d11_abstract_factory_method.H;

import d11_abstract_factory_method.absProduct.Door;
import d11_abstract_factory_method.factory.ElevatorFactory;
import d11_abstract_factory_method.absProduct.Motor;

public class HElevatorFactory extends ElevatorFactory {
    @Override
    public Motor createMotor() {
        return new HMotor();
    }

    @Override
    public Door createDoor() {
        return new HDoor();
    }
}
