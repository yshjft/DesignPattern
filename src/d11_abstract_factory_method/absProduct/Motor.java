package d11_abstract_factory_method.absProduct;

import d11_abstract_factory_method.etc.Direction;
import d11_abstract_factory_method.etc.DoorStatus;
import d11_abstract_factory_method.etc.MotorStatus;

public abstract class Motor {
    private Door door;
    private MotorStatus motorStatus;

    public Motor() {
        this.motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();

        if(motorStatus == MotorStatus.MOVING) return;

        DoorStatus doorStatus = door.getDoorStatus();
        if(doorStatus == DoorStatus.OPENED) door.close();

        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    protected abstract void moveMotor(Direction direction);

    public void setDoor(Door door) {
        this.door = door;
    }
}
