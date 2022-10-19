import java.util.Scanner;

public class CountSevens {
    public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count=0;

      String strI = Integer.toString(n);

      for (int i = 0; i < strI.length(); i++){
         if(strI.substring(i).equals("7")){
             count++;
         }
     }

      System.out.println(count);
   }
}
