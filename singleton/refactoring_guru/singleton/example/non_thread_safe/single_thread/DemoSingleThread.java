package singleton.refactoring_guru.singleton.example.non_thread_safe.single_thread;

public class DemoSingleThread {

    public static void main(String[] args) {
        Singleton singletonFoo = Singleton.getInstance("FOO");
        Singleton singletonBar = Singleton.getInstance("BAR");
        Singleton singletonBaz = Singleton.getInstance("BAZ");

        System.out.println(singletonFoo.value);
        System.out.println(singletonBar.value);
        System.out.println(singletonBaz.value);
    }
}