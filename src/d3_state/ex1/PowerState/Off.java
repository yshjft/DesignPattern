package d3_state.ex1.PowerState;

import d3_state.ex1.Laptop;

public class Off implements PowerState{
    @Override
    public void powerPush(Laptop laptop) {
        System.out.println("SAVING");
        laptop.setPowerState(new Saving());
    }
}
