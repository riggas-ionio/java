import java.util.Scanner;

public class Calculator {
    public int add(int i1, int i2) {
        int sum = i1 +i2;
        return sum;
    }
    //τραγική υλοποίηση πολλαπλασιασμού
    //κατάλληλη μόνο για φυσικούς αριθμούς
    public int multiply(int i1, int i2) { 
        int multi =0;
        for ( int i=1; i<=i1; i++)
            multi = add(multi, i2);
        return multi;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int param1, param2;
        System.out.println("Provide two positive integers:");
        param1 = sc.nextInt();
        param2 = sc.nextInt();
        
        Calculator clt = new Calculator();
        int res = clt.add( param1, param2);
        System.out.println( param1 +" plus "+ param2 + " equals " +res);
        res = clt.multiply( param1, param2);
        System.out.println( param1 +" times "+ param2 + " equals " +res);
    }
}