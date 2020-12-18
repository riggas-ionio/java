import java.util.*;

public class Main{
    public static void main(String[] args){
        Student s = new Student("Dimitris");
        s.login();
        s.login();
        s.login();
        s.logoff();
        s.login();

        s.borrowBook("Java Programming");
        s.borrowBook("Java Programming");
        s.borrowBook("Java Programming, 2nd ed.");
        s.borrowBook("Java Programming, 3nd ed.");
        s.borrowBook("Java Programming, 4nd ed.");

        System.out.println(s);

        Professor p = new Professor("Dimitrios R.");
        p.login();
        p.login();
        p.login();
        p.logoff();
        p.login();

        p.borrowBook("Java Programming");
        p.borrowBook("Java Programming");
        p.borrowBook("Java Programming, 2nd ed.");
        p.borrowBook("Java Programming, 3nd ed.");
        p.borrowBook("Java Programming, 4nd ed.");

        System.out.println(p);

        // Academic ac = new Student("D"); //Not allowed!!!

        Set<LibraryAccess> bookLovers = new HashSet<LibraryAccess>();

        bookLovers.add(s);
        bookLovers.add(p);
        System.out.println("Book lovers are:");
        for(LibraryAccess l: bookLovers){
            System.out.println(l);
        }
    }
}
