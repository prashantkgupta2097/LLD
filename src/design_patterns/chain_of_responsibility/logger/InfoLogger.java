package design_patterns.chain_of_responsibility.logger;

public class InfoLogger extends Logger{

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("INFO" + " :: " + message);
    }
}