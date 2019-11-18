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
        
        // superclass reference - superclass object: allowed
        Post p3 = new Post("George"); 
        // subclass reference - subclass object: allowed
        TextPost p4 = new TextPost("Nancy", "Testing post.."); 
        // superclass reference - subclass object:
        // allowed, but can only access superclass members
        Post p5 = new PhotoPost("George");
        //p5.setPhoto("photo.jpg"); // COMPILER ERROR
        ((PhotoPost)p5).setPhoto("photo.jpg"); //EXPLICIT CASTING
        // subclass reference - superclass object: not allowed
        PhotoPost p6 = new Post("Nancy"); // COMPILER ERROR
    }
}