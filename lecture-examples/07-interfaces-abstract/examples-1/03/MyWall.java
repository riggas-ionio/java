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
    
    public void showExtremeLikables() {
        Likable mostLikable = (Likable)posts.getFirst();
        Dislikable leastLikable = (Dislikable)mostLikable;
        if ( mostLikable == null ) return;
        Likable lk = null;
        Dislikable dk = null;
        for( Post p: posts) {
            lk = (Likable)p;
            dk = (Dislikable)p;
            if ( mostLikable.isMoreLikableThan(lk) < 0 ) 
                mostLikable = lk;
            if ( leastLikable.isLessLikableThan(dk) < 0 ) 
                leastLikable = dk;
                
        }
        System.out.println("+++++ Most likable:\n"+mostLikable);
        System.out.println("----- Least likable:\n"+leastLikable);
    }

}