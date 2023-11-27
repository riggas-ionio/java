public class Main {
    public static void main(String[] args) {
        PhotoPost p1 = new PhotoPost("Nancy");
        p1.setPhoto("selfie.png");
        p1.setCaption("Wow....");
        p1.increaseLikes();
        p1.increaseLikes();
        p1.increaseLikes();
        
        TextPost p2 = new TextPost("Goerge", "Here's a thought..");
        p2.increaseLikes();
        p2.increaseLikes();
        
        MyWall wall = new MyWall();
        wall.addPost(p1);
        wall.addPost(p2);
        
        wall.showPosts();
    }
}