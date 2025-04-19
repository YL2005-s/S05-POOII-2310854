class MercadoPagoAdapter implements PaymentProcessor {
    private final MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
    }

    public boolean processPayment(double amount, String currency) {
        return mercadoPago.executePayment(amount).get("STATUS").equals("SUCCESS");
    }
}
