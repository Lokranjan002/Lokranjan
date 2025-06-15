package Exercise4;

public class PaypalAdapter implements PaymentProcessor {
    private PaypalGateway paypal = new PaypalGateway();

    public void processPayment(double amount) {
        paypal.send(amount);
    }
}

