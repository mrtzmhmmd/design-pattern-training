package singleton.com.journaldev.enum_singleton;

public enum EnumSingleton {
    INSTANCE;

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if (this.value == null) {
            this.value = value;
        }
    }
}