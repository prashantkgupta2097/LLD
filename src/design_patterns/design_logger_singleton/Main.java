package design_patterns.design_logger_singleton;

import design_patterns.chain_of_responsibility.logger.Logger;

public class Main {
    public static void main(String[] args) {
        LoggerChain loggerChain = LoggerChain.getInstance();
        loggerChain.log(Logger.DEBUG, "learning singleton and CoR pattern");
    }
}
