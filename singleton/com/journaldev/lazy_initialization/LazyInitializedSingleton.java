package singleton.com.journaldev.lazy_initialization;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;
    public String value;

    private LazyInitializedSingleton(String value) {
        this.value = value;
    }

    public static LazyInitializedSingleton getInstance(String value) {
        if (instance == null) {
            instance = new LazyInitializedSingleton(value);
        }
        return instance;
    }
}