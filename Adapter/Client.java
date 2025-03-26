class Client {
    private static final Logger log = LoggerFactory.getLogger(Client.class);
    
    public static void main(String[] args) {
        // Create payment details using the new system
        PaymentDetails details = new PaymentDetails(
            "1234-5678-9012-3456",
            "12/26",
            "123",
            99.99
        );
        
        // Use the adapter to process payment with the old system
        PaymentProcessor processor = new PaymentGatewayAdapter();
        boolean success = processor.processPayment(details);
        
        log.info("Payment successful: {}", success);
    }
}