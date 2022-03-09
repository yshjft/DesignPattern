package d11_abstract_factory_method.L;

import d11_abstract_factory_method.absProduct.Door;

public class LDoor extends Door {
    @Override
    protected void doClose() {
        System.out.println("close L Door");
    }

    @Override
    protected void doOpen() {
        System.out.println("open L Door");
    }
}
