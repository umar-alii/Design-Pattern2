class Client {
    public static void main(String[] args) {
        ShoppingFacade facade = new ShoppingFacade();
        facade.placeOrder("user123", "prod456");
    }
}