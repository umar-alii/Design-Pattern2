class OldPaymentGateway {
    private static final Logger log = LoggerFactory.getLogger(OldPaymentGateway.class);
    
    public boolean payWithCard(String cardNumber, String expiry, String cvv, double amount) {
        log.info("Processing payment of ${} using old payment gateway", amount);
        // Legacy payment processing logic
        return true;
    }
}
