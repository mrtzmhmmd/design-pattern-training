package singleton.com.journaldev.thread_safe;

public class DemoThreadSafeSingleton {
    public static void main(String[] args) {
        ThreadSafeSingleton singletonFoo = ThreadSafeSingleton.getInstance("FOO");
        ThreadSafeSingleton singletonBar = ThreadSafeSingleton.getInstance("BAR");
        System.out.println(singletonFoo.value);
        System.out.println(singletonBar.value);
    }
}
