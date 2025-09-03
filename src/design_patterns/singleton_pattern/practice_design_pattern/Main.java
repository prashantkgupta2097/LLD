package design_patterns.singleton_pattern.practice_design_pattern;

import design_patterns.singleton_pattern.Singleton;

public class Main {
    public static void main(String[] args) {
        design_patterns.singleton_pattern.Singleton s1 = design_patterns.singleton_pattern.Singleton.getInstance();
        design_patterns.singleton_pattern.Singleton s2 = Singleton.getInstance();

        if(s1.equals(s2)) {
            System.out.println("only one instance created");
        } else {
            System.out.println("more than one instance created. singleton pattern failed");
        }
    }
}
