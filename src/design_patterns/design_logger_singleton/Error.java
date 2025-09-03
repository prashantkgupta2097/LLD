package design_patterns.design_logger_singleton;

public class Error extends  Logger{

    public Error(int level) {
        this.level = level;
    }

    @Override
    public void write(String msg) {
        System.out.println("ERROR:: " + msg);
    }
}
