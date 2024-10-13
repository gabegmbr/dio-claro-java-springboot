package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso".
 */

public class SingletonLazy {

    private static SingletonLazy instance;
    private SingletonLazy() {
        super();
    }
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
