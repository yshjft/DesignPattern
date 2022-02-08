package d5_adapter.adapter;

import d5_adapter.Adaptee;
import d5_adapter.Target;

public class ClassAdapter extends Adaptee implements Target  {
    @Override
    public void operation() {
        this.specificOperation();
    }
}
