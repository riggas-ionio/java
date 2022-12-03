public enum MediaTypes {
    DVD("DVD Optical Disk"),
    OGG("Streaming Audio"),
    BOOK("Printed Text Media");
    
    private final String description;
    MediaTypes(String descr) {
        this.description = descr;
    }
    
    public String getDescription() {
        return this.description;
    }
}