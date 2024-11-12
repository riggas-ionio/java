public class Main {
    public static void main(String[] args) {
        PhotoPost pp1 = new PhotoPost("Nancy", "selfie.png");
        pp1.setCaption("Wow....");
        pp1.increaseLikes();
        pp1.increaseLikes();
        pp1.increaseLikes();
        System.out.println("Photo ["+pp1.getPhoto()+"] \n"+ // πλέον είναι private
                                pp1.getCaption()+" @ "+pp1.getTimestamp()+"\n"+
                                "by "+pp1.getUsername()+" \n"+
                                "Liked "+pp1.getLikes()+" times.");
        pp1.reset("new_selfie.png");
        System.out.println("Photo ["+pp1.getPhoto()+"] \n"+ // πλέον είναι private
                                pp1.getCaption()+" @ "+pp1.getTimestamp()+"\n"+
                                "by "+pp1.getUsername()+" \n"+
                                "Liked "+pp1.getLikes()+" times.");
        
    }
}