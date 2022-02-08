package d4_command.alarm;

import d4_command.Command;

// concrete command
public class AlarmOnCommand implements Command {
    private Alarm alarm;

    public AlarmOnCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.start();
    }
}
