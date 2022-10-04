public class Main {
    public static void main(String[] args) {
        Post p1 = new Post();
        p1.username = "George";
        p1.text = "My first post";
        p1.timestamp = 2016_11_14_0910L;
        
        PhotoPost pp1 = new PhotoPost();
        pp1.filename = "selfie.png";
        pp1.caption = "Wow....";
        pp1.username = "Nancy";
        pp1.timestamp = 2016_11_14_0912L;
    }
}