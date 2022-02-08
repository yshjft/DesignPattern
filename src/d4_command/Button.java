package d4_command;

// invoker
public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void pressed() {
        command.execute();
    }
}
