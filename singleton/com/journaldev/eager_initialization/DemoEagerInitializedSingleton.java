package singleton.com.journaldev.eager_initialization;

public class DemoEagerInitializedSingleton {
    public static void main(String[] args) {
        EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton anotherSingleton = EagerInitializedSingleton.getInstance();

        System.out.println(singleton.hashCode());
        System.out.println(anotherSingleton.hashCode());
    }
}
