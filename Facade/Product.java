class Product {
    private String id;
    private String name;
    private double price;
    
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getId() {
        return id;
    }
}