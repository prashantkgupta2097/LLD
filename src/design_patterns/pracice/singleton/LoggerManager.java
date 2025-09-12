package design_patterns.pracice.singleton;

public class LoggerManager {
    private static volatile LoggerManager loggerManager;
    private static Logger logger;

    private LoggerManager() {
        Logger info = new InfoLogger(LogLevel.INFO);
        Logger error = new ErrorLogger(LogLevel.ERROR);

        info.setNextLogger(error);
        logger = info;
    }

    public static LoggerManager getLogManager() {
        if(loggerManager == null) {
            synchronized (LoggerManager.class) {
                if(loggerManager == null) {
                    loggerManager = new LoggerManager();
                }
            }
        }
        return loggerManager;
    }

    public void log(LogLevel logLevel, String msg) {
        logger.log(logLevel, msg);
    }
}
