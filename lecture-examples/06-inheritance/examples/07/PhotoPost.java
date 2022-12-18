import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PhotoPost extends Post {
    private String filename;
    private String caption;
    
    public PhotoPost(String username) {
        super(username);
    }
    
    public void setPhoto(String filename) {
        this.filename = filename;
        super.timestamp = Long.parseLong((new SimpleDateFormat("yyyyMMddHHmm")).format(new Date()));
        super.resetLikes();
    }
    public String getPhoto() {
        return this.filename;
    }
    
    public void setCaption(String caption) {
        this.caption = caption;
    }
    public String getCaption() {
        return this.caption;
    }
    
    public String toString() {
        return  "Photo ["+this.filename+"] \n"+ 
                this.caption + "\n"+
                super.toString();
    }
    
}