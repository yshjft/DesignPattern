package d3_state.ex1;

import d3_state.ex1.PowerState.Off;
import d3_state.ex1.PowerState.On;
import d3_state.ex1.PowerState.Saving;

// client
public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        On on = new On();
        Off off = new Off();
        Saving saving = new Saving();

        laptop.powerPush();// OFF -> SAVING
        laptop.powerPush();// SAVING -> ON
        laptop.powerPush();//ON -> OFF
        laptop.powerPush();// OFF -> SAVING
    }
}
