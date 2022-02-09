package d1_singleton;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    public SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return instance;
    }

    public void test() {
        System.out.println("EAGER");
    }
}
