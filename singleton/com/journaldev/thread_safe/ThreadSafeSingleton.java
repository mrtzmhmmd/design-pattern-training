package singleton.com.journaldev.thread_safe;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    public String value;

    public ThreadSafeSingleton(String value) {
        this.value = value;
    }

    public static synchronized ThreadSafeSingleton getInstance(String value) {
        if(instance == null) {
            instance = new ThreadSafeSingleton(value);
        }
        return instance;
    }
}
