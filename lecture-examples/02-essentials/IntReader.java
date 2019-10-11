/******************************************************************************
 *  Τεκμηρίωση IntReader προγράμματος
 *  Αρχείο πηγαίου κώδικα IntReader.java
 * 
 *  Πρόγραμμα σε Java το οποίο διαβάζει μια παράμετρο από το τερματικό 
 *  και την εμφανίζει πάλι σε αυτό. 
 *  @author Dimitrios Ringas
 *  Compilation:  javac IntReader.java
 *  Execution:    java IntReader <text_without_spaces_representing_integer>
 *
 ******************************************************************************/

public class IntReader {
    
    public static void main(String[] args){
        
        int i1 = Integer.parseInt( args[0] );
        System.out.println("Δώσατε παράμετρο τον ακέραιο: "+i1);
        
    }
}