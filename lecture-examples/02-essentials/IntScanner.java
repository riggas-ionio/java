/******************************************************************************
 *  Τεκμηρίωση IntScanner προγράμματος
 *  Αρχείο πηγαίου κώδικα IntScanner.java
 * 
 *  Πρόγραμμα σε Java το οποίο προτρέπει το χρήστη να δώσει ένα ακέραιο αριθμό 
 *  και τον εμφανίζει πάλι στο τερματικό. 
 *  
 *  Compilation:  javac IntScanner.java
 *  Execution:    java IntScanner 
 *
 ******************************************************************************/
import java.util.Scanner;

public class IntScanner {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Πληκτρολογήστε ένα ακέραιο: ");
        
        int i1 = sc.nextInt();
        System.out.println("Πληκτρολογήσατε τον ακέραιο: "+i1);
        
    }
}