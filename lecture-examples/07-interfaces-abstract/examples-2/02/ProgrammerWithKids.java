import java.util.Random;

public class ProgrammerWithKids extends Programmer implements Parent {
    private String whereAreTheKids = "home";
    public ProgrammerWithKids(String name) { super(name); }
    public void dropOffKids(String where) {
        System.out.println(getName()+" drops off kids at "+where);
        this.whereAreTheKids = where;
    }
    public void pickUpKids()
    {
        System.out.println(getName()+" picks up kids from "+whereAreTheKids);
        this.whereAreTheKids = "home";
    }
    
    public void attendParentsMeeting() {
        System.out.println(getName()+" attends parents meeting ");
    }
    
    public void logDay() {
        this.goodmorning();
        this.dropOffKids("school");
        this.goToWork();
        for ( int i=0; i<5; i++) {
            this.doTheWork();
        }
        this.departFromWork();
        this.pickUpKids();
        this.goodnight();
    }
    
    
    public static void main(String args[]) {
        ProgrammerWithKids p = new ProgrammerWithKids("Dimitris");
        p.logDay();
    }
    
}

