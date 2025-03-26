import java.util.logging.Logger;

class PaymentProcessor {
    private static final Logger log = Logger.getLogger(PaymentProcessor.class.getName());
    
    public boolean processPayment(String userId, double amount) {
        log.info("Processing payment of $" + amount + " for user: " + userId);
        return true;
    }
}