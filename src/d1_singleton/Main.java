package d1_singleton;

public class Main {
    public static void main(String[] args) {
        SingletonEager singletonEager = SingletonEager.getInstance();

        SingletonLazy singletonLazy = SingletonLazy.getInstance();

        SingletonLazySync singletonLazySync = SingletonLazySync.getInstance();

        SingletonLazySyncV2 singletonLazySyncV2 = SingletonLazySyncV2.getInstance();
    }
}
