public class HTMLTextPost extends TextPost {

    public HTMLTextPost(String username, String text) {
        super(username, text);
    }
    
    public String toString() {
        return super.toString();
    }
    
    public String render() {
        return   "<div>\n"
                    +"<span>"+super.toString()+"</span>\n"
                +"</div>";

    }
}