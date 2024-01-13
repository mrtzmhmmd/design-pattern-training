package singleton.refactoring_guru.singleton.example.non_thread_safe.single_thread;

public final class Singleton {

    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if(instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}