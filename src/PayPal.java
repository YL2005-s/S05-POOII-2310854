class PayPal {

    public String processPayment(double amount, String currency) {
        System.out.println("Procesando pago de " + amount + " " + currency + " a través de PayPal.");
        return "SUCCESS";
    }
}
