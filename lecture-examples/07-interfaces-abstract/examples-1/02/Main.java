public class Main {
    public static void main(String[] args) {
        HTMLPhotoPost p1 = new HTMLPhotoPost("Nancy");
        p1.setPhoto("selfie.png");
        p1.setCaption("Wow....");
        p1.increaseLikes();

        HTMLTextPost p2 = new HTMLTextPost("Geοrge", "Here's a thought..");
        p2.increaseLikes();
        
        // Post p3 = new HTMLTextPost("George", "Here's another though.."); 

        MyWall wall = new MyWall();
        wall.addPost(p1);
        wall.addPost(p2);
        // wall.addPost(p3);
        
        wall.showPosts();
        
    }
}