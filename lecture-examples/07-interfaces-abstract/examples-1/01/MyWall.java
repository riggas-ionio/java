import java.util.ArrayDeque;
public class MyWall {
    private ArrayDeque<Post> posts= new ArrayDeque<>();
    private int texts, photos;
    
    public void addPost(Post p) {
        this.posts.push(p);
        if ( p instanceof TextPost )
            texts++;
        else if ( p instanceof PhotoPost )
            photos ++;
    }
    
    public void showPosts() {
        System.out.println("Total posts: "+(texts+photos)+" [Text "+texts+"][Photos "+photos+"]");
        System.out.println("=================");
        for( Post p: posts) {
            System.out.println(p);
            System.out.println("=================");
        }
    }
}