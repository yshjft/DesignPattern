package d8_template_method;

import d8_template_method.status.Direction;

public class Main {
    public static void main(String[] args) {
        Door door = new Door();
        AMotor aMotor = new AMotor(door);
        aMotor.move(Direction.UP);

        BMotor bMotor = new BMotor(door);
        bMotor.move(Direction.DOWN);

    }
}
