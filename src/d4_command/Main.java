package d4_command;

import d4_command.alarm.Alarm;
import d4_command.alarm.AlarmOnCommand;
import d4_command.lamp.Lamp;
import d4_command.lamp.LampOffCommand;
import d4_command.lamp.LampOnCommand;

// client
public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);
        Command lampOffCommand = new LampOffCommand(lamp);
        Alarm alarm = new Alarm();
        Command alarmOnCommand = new AlarmOnCommand(alarm);

        Button button1 = new Button(lampOnCommand);
        button1.pressed();
        Button button2 = new Button(lampOffCommand);
        button2.pressed();

        Button button3 = new Button(alarmOnCommand);
        button3.pressed();
    }
}
