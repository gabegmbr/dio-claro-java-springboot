package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 */

public class SingletonLazyHolder {
    private static class Holder {
        public static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }
    public static SingletonLazyHolder getInstance() {
        return Holder.INSTANCE;
    }
}
