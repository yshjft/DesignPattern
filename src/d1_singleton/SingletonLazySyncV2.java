package d1_singleton;

public class SingletonLazySyncV2 {
    private static SingletonLazySyncV2 instance;

    public SingletonLazySyncV2() {
    }

    public static SingletonLazySyncV2 getInstance() {
        if(instance == null) {
            synchronized (SingletonLazySyncV2.class) {
                if(instance == null) {
                    instance = new SingletonLazySyncV2();
                }
            }
        }
        return instance;
    }
}
