package d1_singleton;

public class SingletonLazySync {
    private static SingletonLazySync instance;

    private SingletonLazySync() {}

    public static synchronized SingletonLazySync getInstance() {
        if(instance == null) {
            instance = new SingletonLazySync();
        }
        return instance;
    }
}
