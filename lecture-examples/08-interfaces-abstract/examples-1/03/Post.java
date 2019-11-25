import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Post implements Likable, Dislikable{
    private String username;
    protected long timestamp;
    private int likes;
    
    public Post(String username) {
        this.username = username;
        this.timestamp =  Long.parseLong((new SimpleDateFormat("yyyyMMddHHmm")).format(new Date()));
    }
    
    public final void increaseLikes() {
        this.likes++;
    }
    public final void decreaseLikes() {
        this.likes--;
    }
    public int getLikes() {
        return this.likes;
    }
    public int isMoreLikableThan(Likable other) {
        if ( this.getLikes() == other.getLikes() )
            return 0;
        else if ( this.getLikes() < other.getLikes() )
            return -1;
        return 1;
    }
    public int isLessLikableThan(Dislikable other) {
        if ( this.getLikes() == other.getLikes() )
            return 0;
        else if ( this.getLikes() < other.getLikes() )
            return -1;
        return 1;
    }
    protected void resetLikes() {
        this.likes = 0;
    }
    public String getUsername() {
        return this.username;
    }
    public long getTimestamp() {
        return this.timestamp;
    }
    
    public String toString() {
        return  "by "+ this.username +
                " @ "+this.timestamp+"\n"+
                "Liked "+this.likes+" times.";

    }
}