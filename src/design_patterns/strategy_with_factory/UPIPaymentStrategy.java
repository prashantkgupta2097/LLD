package design_patterns.strategy_with_factory;

// concrete strategy
public class UPIPaymentStrategy implements PaymentStrategy {
    String upiId;

    public UPIPaymentStrategy(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paying " + amount + " from upi: " + this.upiId);
    }
}
