package d11_abstract_factory_method.factory;

import d11_abstract_factory_method.H.HElevatorFactory;
import d11_abstract_factory_method.L.LElevatorFactory;
import d11_abstract_factory_method.etc.VendorID;

public class ElevatorFactoryFactory {
    public static ElevatorFactory getFactory(VendorID vendorID) {
        ElevatorFactory factory = null;

        switch (vendorID) {
            case L:
                factory = new LElevatorFactory();
                break;
            case H:
                factory = new HElevatorFactory();
                break;
        }

        return factory;
    }
}
