public enum MediaTypes {
    DVD("DVD Optical Disk"),
    OGG("OGG Streaming Audio"),
    BOOK("Printed Text Media");

    private final String description;
    MediaTypes(String descr) { 		// προσέξτε της απουσία του public
        this.description = descr;		// δεν μπορεί να κληθεί εκτός του enum
    }
    public String getDescription() {
        return this.description;
    }
    public static void main(String[] args){
        for (MediaTypes mt: MediaTypes.values()) {
            System.out.println(mt+" \t"+mt.getDescription());
        }
        // new MediaTypes("MP4 Video"); //Raises Error: enum types may not be instantiated
        // new MediaTypes.DVD("Optical disk");
    }
}
