package d5_adapter;

public class Client {
    private Target target;

    public Client(Target target) {
        this.target = target;
    }

    public void request() {
        target.operation();
    }
}
