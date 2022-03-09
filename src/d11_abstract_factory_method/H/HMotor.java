package d11_abstract_factory_method.H;

import d11_abstract_factory_method.etc.Direction;
import d11_abstract_factory_method.absProduct.Motor;

public class HMotor extends Motor {
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move H motor");
    }
}
