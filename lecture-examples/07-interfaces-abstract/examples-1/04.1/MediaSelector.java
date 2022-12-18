public class MediaSelector {
    
    public MediaSelector (MediaTypes mt) {
        System.out.println("Selected "+mt+ " filetype: "+mt.description);
    }
    
    public static void main(String[] args) {
        
        MediaTypes.DVD.description ="bad description";
        new MediaSelector(MediaTypes.DVD);
        new MediaSelector(MediaTypes.OGG);
        
    }
}