import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HTMLPhotoPost extends PhotoPost {

    public HTMLPhotoPost(String username) {
        super(username);
    }
    
    public String render() {
        return   "<div>\n"
                    +"<img src='"+super.getPhoto()+"'/>\n"
                    +"<span>"+super.toString()+"</span>\n"
                +"</div>";
    }
    
    /* Cheating! 
    public void increaseLikes() {
        for (int i=0; i<5; i++)
            super.increaseLikes();
    }
    */
    
    public static void main(String[] args) {
        HTMLPhotoPost p = new HTMLPhotoPost("Dimitris");
        p.setPhoto("selfie.jpg");
        p.setCaption("Wow me!");
        System.out.println(p.render());
    }
    
}