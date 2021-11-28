public class Main {
    public static void main(String[] args) {
        TextPost tp1 = new TextPost();
        tp1.username = "George";
        tp1.text = "My first post";
        tp1.timestamp = 2016_11_14_0910L;
        
        PhotoPost pp1 = new PhotoPost();
        pp1.filename = "selfie.png";
        pp1.caption = "Wow....";
        pp1.username = "Nancy";
        pp1.timestamp = 2016_11_14_0912L;
    }
}