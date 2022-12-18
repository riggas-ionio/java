public class TextPost extends Post {
    private String text;
    
    public TextPost(String username, String text) {
        super(username);
        this.text = text;
    }
    
    public String toString() {
        return this.text + "\n"+
                super.toString();
    }
    public static void main(String[] args) {
        System.out.println(new TextPost("Dimitris", "Hello world"));
    }
}