package d5_adapter.adapter;

import d5_adapter.Adaptee;
import d5_adapter.Target;

public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void operation() {
        adaptee.specificOperation();
    }
}
