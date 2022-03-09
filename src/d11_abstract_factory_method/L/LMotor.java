package d11_abstract_factory_method.L;

import d11_abstract_factory_method.etc.Direction;
import d11_abstract_factory_method.absProduct.Motor;

public class LMotor extends Motor {
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move L motor");
    }
}
