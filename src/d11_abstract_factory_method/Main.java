package d11_abstract_factory_method;

import d11_abstract_factory_method.absProduct.Door;
import d11_abstract_factory_method.absProduct.Motor;
import d11_abstract_factory_method.etc.Direction;
import d11_abstract_factory_method.etc.VendorID;
import d11_abstract_factory_method.factory.ElevatorFactory;
import d11_abstract_factory_method.factory.ElevatorFactoryFactory;

public class Main {
    public static void main(String[] args) {
        ElevatorFactory factory = ElevatorFactoryFactory.getFactory(VendorID.H);

        Door door = factory.createDoor();
        Motor motor = factory.createMotor();
        motor.setDoor(door);

        door.open();
        motor.move(Direction.UP);
    }
}
