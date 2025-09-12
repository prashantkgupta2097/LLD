package design_patterns.pracice.singleton;

public class Main {
    public static void main(String[] args) {
        LoggerManager lm1 = LoggerManager.getLogManager();
//        lm.log(LogLevel.INFO, "code working fine :)");
//        lm.log(LogLevel.ERROR, "code broken !!!");
        LoggerManager lm2 = LoggerManager.getLogManager();
        System.out.println(lm1.equals(lm2));
    }
}
