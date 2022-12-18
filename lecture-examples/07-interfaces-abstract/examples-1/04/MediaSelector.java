public class MediaSelector {
    
    public MediaSelector (MediaTypes mt) {
        System.out.println("Selected "+mt+ " filetype: "+mt.getDescription());
    }
    
    public static void main(String[] args) {
        
        new MediaSelector(MediaTypes.DVD);
        new MediaSelector(MediaTypes.OGG);
        
    }
}