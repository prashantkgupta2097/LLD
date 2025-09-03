package design_patterns.chain_of_responsibility.logger;

public class Main {
    public static void main(String[] args) {
        Logger loggerChain = getChain();
        loggerChain.logMessage(Logger.DEBUG, "Printing this message as debug");
        System.out.println("-------------");
        loggerChain.logMessage(Logger.INFO, "printing this message as info");
        System.out.println("-------------");
        loggerChain.logMessage(Logger.WARN, "printing this message as warning");
        System.out.println("-------------");
        loggerChain.logMessage(Logger.ERROR, "printing this message as error");

    }

    private static Logger getChain() {
        Logger debug = new DebugLogger(Logger.DEBUG);
        Logger info = new InfoLogger(Logger.INFO);
        Logger warn = new WarnLogger(Logger.WARN);
        Logger error = new ErrorLogger(Logger.ERROR);

        debug.setNextLogger(info);
        info.setNextLogger(warn);
        warn.setNextLogger(error);
        error.setNextLogger(null);
        return debug;
    }
}
