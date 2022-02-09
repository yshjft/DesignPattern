package d1_singleton;

public class SingletonLazy {
    private static SingletonLazy singletonLazy;

    private SingletonLazy(){}

    public static SingletonLazy getInstance() {
        if(singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }

    public void test() {
        System.out.println("LAZY");
    }
}
