package singleton.com.journaldev.lazy_initialization;

public class DemoLazyInitializedSingleton {
    public static void main(String[] args) {
        LazyInitializedSingleton singletonFoo = LazyInitializedSingleton.getInstance("FOO");
        LazyInitializedSingleton singletonBar = LazyInitializedSingleton.getInstance("BAR");
        System.out.println(singletonFoo.value);
        System.out.println(singletonBar.value);
    }
}