package d11_abstract_factory_method.factory;

import d11_abstract_factory_method.absProduct.Door;
import d11_abstract_factory_method.absProduct.Motor;

public abstract class ElevatorFactory {
    public abstract Motor createMotor();
    public abstract Door createDoor();
}
