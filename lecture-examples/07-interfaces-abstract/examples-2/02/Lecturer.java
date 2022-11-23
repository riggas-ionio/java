import java.util.Random;

public class Lecturer extends Person implements Employee {
    private LecturerWork work ;
    public Lecturer(String name) {
        super(name);
    }
    public void goToWork() {
        System.out.println( getName() + " goes to university.");
    }
    public void doTheWork(){
        int max = work.values().length;
        int randomWork = (new Random()).nextInt(max);
        this.work = (work.values())[randomWork];
        System.out.println( getName() + " current activity: "
            + work.getDescription() +" ("+work+") ");
    }
    public void departFromWork(){
        System.out.println( getName() + " departs from university.");
    }
    
    public void logDay() {
        this.goodmorning();
        this.goToWork();
        for ( int i=0; i<5; i++) {
            this.doTheWork();
        }
        this.departFromWork();
        this.goodnight();
    }
    
    public static void main(String args[]) {
        Lecturer l = new Lecturer("Dimitris");
        l.logDay();
    }
    
}

