public class Post {
    String username;
    long timestamp;
    private int likes;
    
    public void increaseLikes() {
        this.likes++;
    }
    public int getLikes() {
        return this.likes;
    }
}