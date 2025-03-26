class PaymentDetails {
    private String cardNumber;
    private String expiryDate;
    private String securityCode;
    private double amount;
    
    public PaymentDetails(String cardNumber, String expiryDate, String securityCode, double amount) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityCode = securityCode;
        this.amount = amount;
    }
    
    // Getters
    public String getCardNumber() { return cardNumber; }
    public String getExpiryDate() { return expiryDate; }
    public String getSecurityCode() { return securityCode; }
    public double getAmount() { return amount; }
}