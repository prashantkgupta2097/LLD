package design_patterns.pracice.singleton;

public class ErrorLogger extends Logger{

    ErrorLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    public void write(String msg) {
        System.out.println("ERROR :: " + msg);
    }
}
