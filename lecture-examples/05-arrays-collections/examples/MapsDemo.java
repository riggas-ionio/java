import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;


public class MapsDemo {
    
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<String, Integer>();

        // Initialize frequency table from command line
        for (String a : args) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }

        System.out.println("Count parameters: "+args.length);
        System.out.println("Distinct parameters: "+m.size());
        System.out.println(m);
    }
}