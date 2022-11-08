import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;


public class SetsDemo {
    
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        TreeSet<String> treeSet = new TreeSet<String>();
        for (String a : args) {
            hashSet.add(a);    
            treeSet.add(a);    
        }

        System.out.println("HashSet: "+ hashSet);
        System.out.println("TreeSet: "+ treeSet);
        
        System.out.println("HashSet Contains '5'? "+ hashSet.contains("5"));
        hashSet.remove("5");
        System.out.println("HashSet Contains '5'? "+ hashSet.contains("5"));
        System.out.println("HashSet: "+ hashSet);

        System.out.println("First and last in TreeSet? "+ treeSet.first() + " "+ treeSet.last());
        
    }
}