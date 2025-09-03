package design_patterns.chain_of_responsibility.logger;

public abstract class Logger {
    public static final int DEBUG = 4;
    public static final int INFO = 3;
    public static final int WARN = 2;
    public static final int ERROR = 1;

    protected int level;
    protected Logger nextLogger;

    public void setNextLogger(Logger logger) {
        this.nextLogger = logger;
    }

    public void logMessage(int level, String message) {
        if(this.level <= level) {
            write(message);
        }
        if(nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract void write(String message);
}
