package design_patterns.singleton_pattern;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if(s1.equals(s2)) {
            System.out.println("only one instance created");
        } else {
            System.out.println("more than one instance created. singleton pattern failed");
        }
    }
}
