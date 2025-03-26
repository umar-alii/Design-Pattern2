class Client {
    private static final Logger log = LoggerFactory.getLogger(Client.class);
    
    public static void main(String[] args) {
        // Using the proxy
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");
        
        // Image1 will be loaded from disk
        image1.display();
        
        // Image2 hasn't been loaded yet
        log.info("Image2 not loaded yet");
        
        // Now image2 will be loaded
        image2.display();
        
        // Image1 won't be loaded again, just displayed
        image1.display();
    }
}