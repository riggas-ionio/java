import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PhotoPost extends Post {
    private String filename;
    private String caption;
    
    public PhotoPost(String username, String filename) {
        super(username);
        this.filename = filename;
    }
    
    public void reset(String filename) {
        this.filename = filename;
        super.reset();
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
}