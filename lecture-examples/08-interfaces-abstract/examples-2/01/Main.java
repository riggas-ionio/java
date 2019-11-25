import java.util.*;

public class Main {
    private static Set<Person> people = new HashSet<Person>();
    private static Set<Parent> parents = new HashSet<Parent>();
    
    public static void main(String args[]) {
        Person p1 = new LecturerWithKids("Dimitris");
        people.add(p1);
        parents.add((Parent)p1);
        
        Person p2 = new LecturerWithKids("George");
        people.add(p2);
        parents.add((Parent)p2);
        
        Person p3 = new Lecturer("Kostas");
        people.add(p3);
        //parents.add((Parent)p3);
        
    }
}