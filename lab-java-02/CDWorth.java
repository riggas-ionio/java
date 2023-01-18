import java.util.Scanner;
import java.lang.Math;

public class CDWorth {
    public static void main(String[] args){
        System.out.print("Please enter the amount to be deposited: ");

        Scanner in = new Scanner(System.in);
        double presentVal=in.nextDouble();

        System.out.print("Please enter the rate of interest: ");
        double inRate=in.nextDouble();

        System.out.print("Please enter the number of years: ");
        int years= in.nextInt();

        double futureVal=0;

        futureVal=presentVal*Math.pow(1+(inRate/100),years);
        System.out.printf("%.2f\n", futureVal);
    }
}
