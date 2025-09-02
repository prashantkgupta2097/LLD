package design_patterns.singleton_pattern;

public final class Singleton { // final will ensure no one can extend this class
    private static Singleton instance;

    private Singleton(){

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
