import java.util.logging.Logger;

class OrderManager {
    private static final Logger log = Logger.getLogger(OrderManager.class.getName());
    
    public String createOrder(String userId, Product product) {
        String orderId = "ORD" + System.currentTimeMillis();
        log.info("Creating order: " + orderId + " for user: " + userId);
        return orderId;
    }
    
    public void fulfillOrder(String orderId) {
        log.info("Preparing order for shipment: " + orderId);
    }
}