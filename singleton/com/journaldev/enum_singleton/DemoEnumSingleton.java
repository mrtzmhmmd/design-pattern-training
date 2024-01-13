package singleton.com.journaldev.enum_singleton;

public class DemoEnumSingleton {
    public static void main(String[] args) {
        EnumSingleton.INSTANCE.setValue("Hello, World!");
        System.out.println(EnumSingleton.INSTANCE.getValue());
        EnumSingleton.INSTANCE.setValue("Goodbye, World!");
        System.out.println(EnumSingleton.INSTANCE.getValue());
    }
}