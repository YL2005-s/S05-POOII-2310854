import java.util.Map;

class MercadoPago {

    public Map<String, Object> executePayment(double amount) {
        System.out.println("Procesando pago de " + amount + " a través de MercadoPago.");
        return Map.of("STATUS", "SUCCESS");
    }
}
