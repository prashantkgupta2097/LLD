package design_patterns.design_logger_singleton;

public class LoggerChain {
    private static volatile LoggerChain instance;
    private Logger logger;

    private LoggerChain(){
        Logger debug = new Debug(Logger.DEBUG);
        Logger info = new Info(Logger.INFO);
        Logger warn = new Warn(Logger.WARN);
        Logger error = new Error(Logger.ERROR);

        debug.setNextLogger(info);
        info.setNextLogger(warn);
        warn.setNextLogger(error);
        error.setNextLogger(null);

        this.logger = debug;
    }

    public static LoggerChain getInstance() {
        if(instance == null) {
            synchronized (LoggerChain.class) {
                if(instance == null) {
                    instance = new LoggerChain();
                }
            }
        }
        return instance;
    }

    public void log(int level, String msg) {
        this.logger.logMessage(level, msg);
    }
}
