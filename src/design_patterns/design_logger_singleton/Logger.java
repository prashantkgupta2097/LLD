package design_patterns.design_logger_singleton;

public abstract class Logger {
    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int WARN = 3;
    public static final int ERROR = 4;

    protected int level;
    protected Logger nextLogger;

    public void setNextLogger(Logger logger){
        this.nextLogger = logger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    public abstract void write(String msg);
}
