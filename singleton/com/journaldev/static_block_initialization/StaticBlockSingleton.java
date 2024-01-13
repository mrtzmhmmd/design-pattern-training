package singleton.com.journaldev.static_block_initialization;

public class StaticBlockSingleton {

    private static final StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance " + e.getMessage());
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
