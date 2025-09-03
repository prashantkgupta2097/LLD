package design_patterns.design_logger_singleton;

public class Debug extends Logger{
    public Debug(int level) {
        this.level = level;
    }

    @Override
    public void write(String msg) {
        System.out.println("DEBUG:: " + msg);
    }
}
