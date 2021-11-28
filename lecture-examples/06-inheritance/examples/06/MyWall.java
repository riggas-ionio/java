import java.util.ArrayDeque;
public class MyWall {
    private ArrayDeque<Post> posts= new ArrayDeque<>();
    
    public void addPost(Post p) {
        this.posts.push(p);
    }
    
    public void showPosts() {
        for( Post p: posts) {
            System.out.println(p.toString());
            System.out.println("=================");
        }
    }
}