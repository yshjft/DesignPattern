package d3_state.ex1.PowerState;

import d3_state.ex1.Laptop;

public class Saving implements PowerState{
    @Override
    public void powerPush(Laptop laptop) {
        System.out.println("ON");
        laptop.setPowerState(new On());
    }
}
