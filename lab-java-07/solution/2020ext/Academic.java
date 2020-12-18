import java.util.*;

public abstract class Academic implements LibraryAccess, NetworkAccess{
    private String name;
    private int activeNetworks =0;
    private final int MAX_NETWORKS; //will be initialised by chilred classes
    private Set<String> borrowedBooks = new TreeSet<String>();
    private final int MAX_BOOKS;

    public Academic(String name, int maxNetworks, int maxBooks){
        this.name = name;
        this.MAX_NETWORKS = maxNetworks;
        this.MAX_BOOKS = maxBooks;
    }
    public String toString(){
        return this.name
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
            System.out.println("Network login for "+this.name);
        }
        else {
            System.out.println(this.name+ " has already reached maximum number of allowed network connections.");
        }
    }
    public void logoff(){
        if(this.activeNetworks>0){
            this.activeNetworks--;
            System.out.println("Network logoff for "+this.name);
        }
        else {
            System.out.println("Strange!.. "+this.name+ " does not appear to be online.");
        }
    }
}
