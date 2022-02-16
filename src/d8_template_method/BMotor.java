package d8_template_method;

import d8_template_method.status.Direction;

public class BMotor extends Motor{
    public BMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move BMotor: "+direction.name());
    }
}
