import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;


public class MapsDemo {

    public static void main(String[] args) {
        Map<String, Integer> m = new TreeMap<String, Integer>();

        // Initialize frequency table from command line
        for (String a : args) {
            Integer freq = m.get(a);
            // m.put(a, (freq == null) ? 1 : freq + 1);
            System.out.println("Map get key "+a+": "+freq);
            if ( freq==null )
                m.put(a, 1); // java promotes int 1 to Integer(1)
            else
                m.put(a, freq+1); //java allows Integer object +1
        }

        // System.out.println("Count parameters: "+args.length);
        System.out.println("Distinct parameters: "+m.size());
        System.out.println(m);
    }
}
