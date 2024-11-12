import java.util.*;

public class ListRemove{

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        Random rand = new Random();

        for (int i = 0; i < 10; i++) 
            list.add(rand.nextInt(100));

        System.out.println(list);

        int l = list.size();
        int j = 0;
        while (j < l ) {
            int i = list.get(j); 
            System.out.print(i + " "); 
            if (i % 2 != 0)
                list.remove(j); 
            j++;
        }
        System.out.println("\n"+list);
    }

}


