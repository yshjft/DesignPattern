package d5_adapter;

import d5_adapter.adapter.ClassAdapter;
import d5_adapter.adapter.ObjectAdapter;

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client(new ClassAdapter());
        c1.request();

        Client c2 = new Client(new ObjectAdapter(new Adaptee()));
        c2.request();
    }
}
