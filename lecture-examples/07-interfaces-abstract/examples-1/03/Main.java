public class Main {
    public static void main(String[] args) {
        PhotoPost p1 = new PhotoPost("Nancy");
        p1.setPhoto("selfie.png");
        p1.setCaption("Wow....");
        p1.increaseLikes();
        p1.increaseLikes();
        p1.increaseLikes();
        
        TextPost p2 = new TextPost("Geοrge", "Here's a thought..");
        p2.increaseLikes();
        p2.increaseLikes();
        
        Post p3 = new TextPost("George", "Here's another though.."); 

        MyWall wall = new MyWall();
        wall.addPost(p1);
        wall.addPost(p2);
        wall.addPost(p3);
        
        wall.showPosts();
        System.out.println("\n\n");
        wall.showExtremeLikables();
        
        
        Book b = new Book("Harry Potter");
        for( int i=0; i<1000; i++)
            b.increaseLikes();
            
        System.out.println(p1.isMoreLikableThan(b));
        
    }
}