package design_patterns.chain_of_responsibility.logger;

public class WarnLogger extends Logger{

    public WarnLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("WARN" + " :: " + message);
    }
}