package d11_abstract_factory_method.H;

import d11_abstract_factory_method.absProduct.Door;

public class HDoor extends Door {
    @Override
    protected void doClose() {
        System.out.println("close H door");
    }

    @Override
    protected void doOpen() {
        System.out.println("open H door");
    }
}
