package design_patterns.strategy_with_factory;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy upiStrategy = PaymentStrategyFactory.getPaymentStrategy("upi");

        PaymentService ps = new PaymentService(upiStrategy);

        ps.makePayment(500);

        PaymentStrategy creditCardStrategy = PaymentStrategyFactory.getPaymentStrategy("credit_card");

        ps.changePaymentStrategy(creditCardStrategy);

        ps.makePayment(800);
    }
}
