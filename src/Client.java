class Client {

    public void checkout(PaymentProcessor processor, double amount, String currency) {
        if (processor.processPayment(amount, currency)) {
            System.out.println("El pago se ha completado correctamente.");
        } else {
            System.out.println("No se pudo completar el pago. Por favor, inténtelo nuevamente.");
        }
    }
}
