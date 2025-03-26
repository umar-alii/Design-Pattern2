class ProxyImage implements Image {
    private static final Logger log = LoggerFactory.getLogger(ProxyImage.class);
    private String filename;
    private RealImage realImage;
    
    public ProxyImage(String filename) {
        this.filename = filename;
        // Note: RealImage is not created here
    }
    
    @Override
    public void display() {
        // Lazy initialization - load the image only when needed
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}