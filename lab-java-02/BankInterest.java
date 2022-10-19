import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class BankInterest {
    public static void main(String[] args)
    {
       final double HI_RATE = 2.75;
       final double MD_RATE = 2.00;
       final double LO_RATE = 1.00;
       final double ZERO_RATE = 0.00;
       final double DEB_CHG = -25.00;
 
       final double HI_LIMIT = 100000.00;
       final double MD_LIMIT = 25000.00;
       final double LO_LIMIT = 10000.00;
       final double ZERO_LIMIT = 0.00;
 
       System.out.print("Enter current balance: ");
 
       Scanner in = new Scanner(System.in);
       double balance = in.nextDouble();
       
       double newBalance=0;

        if(balance>HI_LIMIT){
        newBalance=balance*HI_RATE;
        }
        else
        if(balance>MD_LIMIT){
            newBalance=balance*MD_RATE;
        }
        else 
        if(balance>LO_RATE){
            newBalance=balance*LO_RATE;
        }
        else 
        if(balance>=ZERO_LIMIT){
            newBalance=balance*ZERO_LIMIT;
        }
        else 
        newBalance=25.00;

       System.out.printf("%.2f\n", newBalance);
    }
}
