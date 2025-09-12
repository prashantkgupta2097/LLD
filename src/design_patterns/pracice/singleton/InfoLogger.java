package design_patterns.pracice.singleton;

public class InfoLogger extends Logger{

    public InfoLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    public void write(String msg) {
        System.out.println("INFO :: " + msg);
    }
}
