package design_patterns.strategy_with_factory;

// concrete strategy
public class StripePaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("paying " + amount + " using stripe method");
    }
}
