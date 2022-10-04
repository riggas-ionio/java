import java.util.ArrayDeque;
import java.util.HashMap;
public class MyWall {
    private ArrayDeque<Post> posts= new ArrayDeque<>();
    private HashMap<String, Integer> countPostsByClass = new HashMap<>();

    public void addPost(Post p) {
        this.posts.push(p);
        String className = p.getClass().getName();
        Integer prevCount = countPostsByClass.get(className);
        countPostsByClass.put(className, prevCount==null ? 1 : prevCount+1 );
    }

    public void showPosts() {
        System.out.println("Total posts: "+posts.size()+" "+countPostsByClass.toString());
        System.out.println("=================");
        for( Post p: posts) {
            System.out.println(p);
            System.out.println("=================");
        }
    }
}
