class StripeAdapter implements PaymentProcessor {
    private final Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    public boolean processPayment(double amount, String currency) {
        return stripe.charge(amount);
    }
}
