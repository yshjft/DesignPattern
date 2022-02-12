package d3_state.ex1.PowerState;

import d3_state.ex1.Laptop;

public class On implements PowerState{
    @Override
    public void powerPush(Laptop laptop) {
        System.out.println("OFF");
        laptop.setPowerState(new Off());
    }
}
