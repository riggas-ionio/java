import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book implements Likable{
    private String title;
    private int likes;
    
    public Book(String title) {
        this.title = title;
    }
    
    public final void increaseLikes() {
        this.likes++;
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
    public String toString() {
        return  "Book "+ this.title +
                "Liked "+this.likes+" times.";

    }
}