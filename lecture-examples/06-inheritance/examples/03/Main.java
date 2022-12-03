public class Main {
    public static void main(String[] args) {
        PhotoPost pp1 = new PhotoPost();
        pp1.filename = "selfie.png";
        pp1.caption = "Wow....";
        pp1.username = "Nancy";
        pp1.increaseLikes();
        pp1.increaseLikes();
        pp1.increaseLikes();
        System.out.println("Photo ["+pp1.filename+"] \n"+
                                pp1.caption+" \n"+
                                "by "+pp1.username+" \n"+
                                "Liked "+pp1.getLikes()+" times.");
    }
}