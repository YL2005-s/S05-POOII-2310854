class PayPalAdapter implements PaymentProcessor{
    private final PayPal paypal;

    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    public boolean processPayment(double amount, String currency) {
        return paypal.processPayment(amount, currency).equals("SUCCESS");
    }
}
