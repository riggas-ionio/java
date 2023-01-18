import java.util.*;

public class array2 {
    public static void main(String[] args){
        

        try (Scanner input = new Scanner(System.in)) {
            int[] array = new int[5];
            System.out.println("Enter number to fill the array: \n");

            for(int i=0; i<array.length; i++){
                array[i]=input.nextInt();
            }
            
            for(int i=0; i<array.length; i++){
                System.out.println("i= "+ array[i]);
            }
        }
    }
    
}
