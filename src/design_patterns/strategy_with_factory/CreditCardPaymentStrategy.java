package design_patterns.strategy_with_factory;

// concrete strategy
public class CreditCardPaymentStrategy implements PaymentStrategy {
    private final int cardNumber;
    private final int cvv;
    private final String name;
    private final int pin;

    public CreditCardPaymentStrategy(int cardNumber, int cvv, String name, int pin) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.name = name;
        this.pin = pin;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paying " + amount + " via credit card");
    }
}
