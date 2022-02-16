package d8_template_method;

import d8_template_method.status.Direction;

public class AMotor extends Motor{
    public AMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move AMotor: "+direction.name());
    }
}
