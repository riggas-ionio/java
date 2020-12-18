import java.util.*;

public class Student implements LibraryAccess, NetworkAccess{
    private String name;
    private int activeNetworks =0;
    private final int MAX_NETWORKS =1;
    private Set<String> borrowedBooks = new TreeSet<String>();
    private final int MAX_BOOKS =3;

    public Student(String name){
        this.name = name;
    }
    public String toString(){
        return "Student "+this.name
            +" has "+this.activeNetworks+" active network connections"
            +" has borrowed the following books: "+this.borrowedBooks;
    }

    public void borrowBook(String title){
        if (this.borrowedBooks.size() < this.MAX_BOOKS){
            if ( !this.borrowedBooks.contains(title) ){
                this.borrowedBooks.add(title);
                System.out.println(this.name+ " just borrowed "+title);
            } else {
                System.out.println(this.name+ " has already borrowed "+title);
            }
        }
        else{
            System.out.println(this.name+ " has already borrowed the maximum number of allowed books.");
        }
    }
    public void returnBook(String title){
        if(!this.borrowedBooks.contains(title)){
            System.out.println("Strange!... "+this.name+" has not borrowed "+title);
            return;
        }
        this.borrowedBooks.remove(title);
        System.out.println("Thank you "+this.name+" for returning "+title);
    }
    public void login(){
        if(this.activeNetworks<this.MAX_NETWORKS){
            this.activeNetworks++;
            System.out.println("Nework login for "+this.name);
        }
        else {
            System.out.println(this.name+ " has already reached maximum number of allowed network connections.");
        }
    }
    public void logoff(){
        if(this.activeNetworks>0){
            this.activeNetworks--;
            System.out.println("Nework logoff for "+this.name);
        }
        else {
            System.out.println("Strange!.. "+this.name+ " does not appear to be online.");
        }
    }
}
