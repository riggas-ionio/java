import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class ArrayListDemo {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (String a : args)
            list.add(a);        
        
        Collections.shuffle(list);
        System.out.println("Shuffled: "+ list);
        Collections.sort(list);
        System.out.println("Sorted: "+ list);
        
        System.out.println("Contains '5'? "+ list.contains("5"));
        System.out.println("indexOf '5'? "+ list.indexOf("5"));
        
        list.remove("5");
        System.out.println("Contains '5'? "+ list.contains("5"));
        System.out.println("indexOf '5'? "+ list.indexOf("5"));
 
        System.out.println("Before add size is: "+ list.size());
        list.add("last");
        System.out.println("After add size is: "+ list.size());
        System.out.println("After add list is: "+ list);
        
    }
}