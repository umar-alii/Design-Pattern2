import java.util.logging.Logger;

class ProductCatalog {
    private static final Logger log = Logger.getLogger(ProductCatalog.class.getName());
    
    public Product getProductById(String productId) {
        log.info("Fetching product details for: " + productId);
        return new Product(productId, "Sample Product", 99.99);
    }
    
    public boolean isInStock(String productId) {
        log.info("Checking inventory for: " + productId);
        return true;
    }
}