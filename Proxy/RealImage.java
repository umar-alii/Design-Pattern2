import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class RealImage implements Image {
    private static final Logger log = LoggerFactory.getLogger(RealImage.class);
    private String filename;
    
    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }
    
    private void loadFromDisk() {
        log.info("Loading image from disk: {}", filename);
        
    }
    
    @Override
    public void display() {
        log.info("Displaying image: {}", filename);
    }
}