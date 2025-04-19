public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        PaymentProcessor stripeAdapter = new StripeAdapter(new Stripe());
        PaymentProcessor payPalAdapter = new PayPalAdapter(new PayPal());

        client.checkout(stripeAdapter, 60.0, "USD");
        client.checkout(payPalAdapter,40.0, "PEN");
    }
}