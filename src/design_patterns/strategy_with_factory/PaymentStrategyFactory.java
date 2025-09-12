package design_patterns.strategy_with_factory;

import java.util.*;

public class PaymentStrategyFactory {
    public static PaymentStrategy getPaymentStrategy(String name) {
        return switch (name) {
            case "upi" -> new UPIPaymentStrategy("example@upi");
            case "stripe" -> new StripePaymentStrategy();
            case "credit_card" -> new CreditCardPaymentStrategy(1234, 321, "prashant", 210427);
            default -> throw new IllegalArgumentException("wrong type");
        };
    }
}
