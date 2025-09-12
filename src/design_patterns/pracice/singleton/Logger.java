package design_patterns.pracice.singleton;

public abstract class Logger {
    private LogLevel logLevel;
    private Logger nextLogger;

    Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void setNextLogger(Logger logger) {
        this.nextLogger = logger;
    }

    public void log(LogLevel logLevel, String msg) {
        if (logLevel.compareTo(this.logLevel) <= 0) {
            write(msg);
        }

        if (this.nextLogger != null) {
            this.nextLogger.log(logLevel, msg);
        }
    }

    public abstract void write(String msg);
}
