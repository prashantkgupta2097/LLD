package design_patterns.design_logger_singleton;

public class Info extends Logger{
    public Info(int level) {
        this.level = level;
    }

    @Override
    public void write(String msg) {
        System.out.println("INFO:: " + msg);
    }
}
