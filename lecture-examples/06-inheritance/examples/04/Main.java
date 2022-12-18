public class Main {
    public static void main(String[] args) {
        PhotoPost pp1 = new PhotoPost("Nancy");
        //pp1.username = "Nancy";   πλεόν είναι private
        pp1.filename = "selfie.png";
        pp1.caption = "Wow....";
        pp1.increaseLikes();
        pp1.increaseLikes();
        pp1.increaseLikes();
        System.out.println("Photo ["+pp1.filename+"] \n"+ // πλέον είναι private
                                pp1.caption+" @ "+pp1.getTimestamp()+"\n"+
                                "by "+pp1.getUsername()+" \n"+
                                "Liked "+pp1.getLikes()+" times.");
    }
}