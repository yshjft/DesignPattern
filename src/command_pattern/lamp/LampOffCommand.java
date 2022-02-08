package command_pattern.lamp;

import command_pattern.Command;

// concrete command
public class LampOffCommand implements Command {
    private Lamp lamp;

    public LampOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOff();
    }
}
