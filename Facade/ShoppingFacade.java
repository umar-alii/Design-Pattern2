import java.util.logging.Logger;

public class ShoppingFacade {
    private static final Logger log = Logger.getLogger(ShoppingFacade.class.getName());
    
    private ProductCatalog productCatalog;
    private PaymentProcessor paymentProcessor;
    private OrderManager orderManager;
    
    public ShoppingFacade() {
        this.productCatalog = new ProductCatalog();
        this.paymentProcessor = new PaymentProcessor();
        this.orderManager = new OrderManager();
    }
    
    public boolean placeOrder(String userId, String productId) {
       
        if (!productCatalog.isInStock(productId)) {
            log.info("Product is out of stock!");
            return false;
        }
        
        Product product = productCatalog.getProductById(productId);
        
       
        boolean paymentSuccessful = paymentProcessor.processPayment(userId, product.getPrice());
        if (!paymentSuccessful) {
            log.info("Payment failed!");
            return false;
        }
        
        
        String orderId = orderManager.createOrder(userId, product);
        
        
        orderManager.fulfillOrder(orderId);
        
        log.info("Order placed successfully!");
        return true;
    }
}