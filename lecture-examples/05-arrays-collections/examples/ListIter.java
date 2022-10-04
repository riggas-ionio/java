import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ListIter {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++)
            list.add(rand.nextInt(100));
        System.out.println(list);

        Iterator iter = list.iterator();

        while (iter.hasNext()) {
            int i = (Integer)iter.next();
            System.out.print(i + " ");
            if (i % 2 != 0)
                iter.remove();
        }

        System.out.println("\n"+list);
    }
}
