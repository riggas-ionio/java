import java.util.ArrayList;
import java.util.Random;

public class Wrappers{
    public static void main(String[] args){
        ArrayList<Integer> integers = new ArrayList<Integer>();
        Random r = new Random();
        for (int i=0; i<5; i++){
            int value = r.nextInt();
            integers.add(value); //autoboxing int to Integer
        }
        for (int i: integers){  // auto-unboxing Integer to int
            System.out.println(i);
        }
    }
}
