package Exercise8;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.makePayment(500);

        context.setPaymentStrategy(new PayPalPayment());
        context.makePayment(300);
    }
}
