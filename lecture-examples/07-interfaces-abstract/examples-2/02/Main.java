import java.util.*;

public class Main {
    private static Set<Person> people = new HashSet<Person>();
    private static Set<Parent> parents = new HashSet<Parent>();
    
    public static void main(String args[]) {
        Person p1 = new LecturerWithKids("Dimitris");
        people.add(p1);
        parents.add((Parent)p1);
        
        Person p2 = new ProgrammerWithKids("George");
        people.add(p2);
        parents.add((Parent)p2);
        
        Person p3 = new Lecturer("Kostas");
        people.add(p3);
        // parents.add((Parent)p3);  // Not allowed!
        
        Person p4 = new Programmer("Peter");
        people.add(p4);
        // parents.add((Parent)p2);
        
        int i=1;
        for (Person p: people) {
            System.out.println("\nPerson "+(i++)+"\n"+p);
            p.logDay();
        }
        
        i=1;
        for (Parent p: parents) {
            System.out.println("\nParent "+(i++)+"\n"+p);
            ((Person)p).logDay(); // programmer's responsibility!
            // p.logDay(); //δεν είναι δυνατό
        }
    }
}