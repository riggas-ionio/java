import java.util.Scanner;

public class Power {
    public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      double x = in.nextDouble();
      int n = in.nextInt();
      double power=0;

      for(int i=0; i<n; i++){
        power=x*x;
      }

      System.out.println(power);
   }
}
