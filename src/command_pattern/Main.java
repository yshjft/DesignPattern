package command_pattern;

import command_pattern.alarm.Alarm;
import command_pattern.alarm.AlarmOnCommand;
import command_pattern.lamp.Lamp;
import command_pattern.lamp.LampOnCommand;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);
        Alarm alarm = new Alarm();
        Command alarmOnCommand = new AlarmOnCommand(alarm);

        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        Button button2 = new Button(alarmOnCommand);
        button2.pressed();
    }
}
