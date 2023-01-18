import java.util.Scanner;

public class Smallest {
   public static void main(String[] args)
   {
      System.out.println("Please enter three integer values:");

      Scanner in = new Scanner(System.in);
      int value1 = in.nextInt();
      int value2 = in.nextInt();
      int value3 = in.nextInt();

      int smallest;

      if(value1<value2 && value1<value3){
        smallest=value1;
      }
      else
      if(value2<value1 && value2<value3){
        smallest=value2;
      }
      else 
      smallest=value3;

      System.out.println(smallest);
   }
}
    

