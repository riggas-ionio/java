import java.util.Random;

public class Programmer extends Person implements Employee {
    private ProgrammerWork work ;
    public Programmer(String name) {
        super(name);
    }
    public void goToWork() {
        System.out.println( getName() + " logs in.");
    }
    public void doTheWork(){
        int max = work.values().length;
        int randomWork = (new Random()).nextInt(max);
        this.work = (work.values())[randomWork];
        System.out.println( getName() + " current activity: "
            + work.getDescription() +" ("+work+") ");
    }
    public void departFromWork(){
        System.out.println( getName() + " logs off.");
    }
    
    public void logDay() {
        this.goodmorning();
        this.goToWork();
        for ( int i=0; i<8; i++) {
            this.doTheWork();
        }
        this.departFromWork();
        this.goodnight();
    }
    
    public static void main(String args[]) {
        Programmer p = new Programmer("George");
        p.logDay();
    }
    
}

