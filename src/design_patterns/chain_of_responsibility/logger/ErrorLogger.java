package design_patterns.chain_of_responsibility.logger;

public class ErrorLogger extends Logger{

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("ERROR" + " :: " + message);
    }
}