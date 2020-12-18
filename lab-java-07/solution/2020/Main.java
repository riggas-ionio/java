
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
    }
}
