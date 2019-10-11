/******************************************************************************
 *  Τεκμηρίωση ArgsReader προγράμματος
 *  Αρχείο πηγαίου κώδικα ArgsReader.java
 * 
 *  Πρόγραμμα σε Java το οποίο διαβάζει μια παράμετρο από το τερματικό 
 *  και την εμφανίζει πάλι σε αυτό. 
 *  
 *  Compilation:  javac ArgsReader.java
 *  Execution:    java ArgsReader <text_without_spaces>
 *
 ******************************************************************************/

public class ArgsReader {
    
    public static void main(String[] args){
        
        for ( int i=0; i< args.length; i++)
        {
            String s1 = args[i];
            System.out.println("Δώσατε παράμετρο: "+s1);
        }
        
    }
}