package design_patterns.design_logger_singleton;

public class Warn extends Logger{
    public Warn(int level) {
        this.level = level;
    }

    @Override
    public void write(String msg) {
        System.out.println("WARN:: " + msg);
    }
}
