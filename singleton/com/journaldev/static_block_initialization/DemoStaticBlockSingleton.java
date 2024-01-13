package singleton.com.journaldev.static_block_initialization;
public class DemoStaticBlockSingleton {
    public static void main(String[] args) {
        StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
        StaticBlockSingleton anotherSingleton = StaticBlockSingleton.getInstance();
        System.out.println(singleton.hashCode());
        System.out.println(anotherSingleton.hashCode());
    }
}
