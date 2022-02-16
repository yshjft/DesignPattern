package d8_template_method;

import d8_template_method.status.Direction;
import d8_template_method.status.DoorStatus;
import d8_template_method.status.MotorStatus;

public abstract class Motor {
    protected Door door;
    protected MotorStatus motorStatus;

    public Motor(Door door) {
        this.door = door;
        this.motorStatus = MotorStatus.STOPPED;
    }

    protected abstract void moveMotor(Direction direction);

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
}
