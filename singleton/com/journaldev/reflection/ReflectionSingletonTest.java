package singleton.com.journaldev.reflection;

import singleton.com.journaldev.eager_initialization.EagerInitializedSingleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor<?> constructor: constructors) {
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(instanceOne.hashCode());
        assert instanceTwo != null;
        System.out.println(instanceTwo.hashCode());
    }
}
