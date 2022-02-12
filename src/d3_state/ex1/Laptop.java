package d3_state.ex1;

import d3_state.ex1.PowerState.Off;
import d3_state.ex1.PowerState.PowerState;

public class Laptop {
    private PowerState powerState;

    public Laptop() {
        this.powerState = new Off();
    }

    public void setPowerState(PowerState powerState) {
        this.powerState = powerState;
    }

    public void powerPush() {
        powerState.powerPush(this);
    }
}
