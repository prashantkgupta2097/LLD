package design_patterns.chain_of_responsibility.logger;

public class DebugLogger extends Logger{

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("DEBUG" + " :: " + message);
    }
}
