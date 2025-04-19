class Stripe {

    public boolean charge(double amount) {
        System.out.println("Procesando pago de " + amount + " a través de Stripe.");
        return true;
    }
}
