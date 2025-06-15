package Exercise4;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PaypalAdapter();
        PaymentProcessor stripe = new StripeAdapter();

        paypal.processPayment(100);
        stripe.processPayment(250);
    }
}
