package Exercise4;


public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripe = new StripeGateway();

    public void processPayment(double amount) {
        stripe.charge(amount);
    }
}
