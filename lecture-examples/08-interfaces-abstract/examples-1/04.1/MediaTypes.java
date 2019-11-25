public enum MediaTypes {
    DVD("DVD Optical Disk"),
    OGG("Streaming Audio"),
    BOOK("Printed Text Media");
    
    public final String description;
    MediaTypes(String descr) {
        this.description = descr;
    }
    
}