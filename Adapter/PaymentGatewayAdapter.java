class PaymentGatewayAdapter implements PaymentProcessor {
    private static final Logger log = LoggerFactory.getLogger(PaymentGatewayAdapter.class);
    private OldPaymentGateway oldGateway;
    
    public PaymentGatewayAdapter() {
        this.oldGateway = new OldPaymentGateway();
    }
    
    @Override
    public boolean processPayment(PaymentDetails details) {
        log.info("Adapting new payment system to the old gateway");
        return oldGateway.payWithCard(
            details.getCardNumber(),
            details.getExpiryDate(),
            details.getSecurityCode(),
            details.getAmount()
        );
    }
}