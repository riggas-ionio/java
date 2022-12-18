import java.util.Scanner;

public class Calculator {
    public int multiply(int i1, int i2) {
        int multi = i1 * i2;
        return multi;
    }
    public double multiply(double d1, double d2) {
        double multi = d1 * d2;
        return multi;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int param1, param2;
        System.out.println("Provide two integers:");
        param1 = sc.nextInt();
        param2 = sc.nextInt();
        
        Calculator clt = new Calculator();
        int res = clt.multiply( param1, param2);
        System.out.println( param1 +" times "+ param2 + " equals " +res);

        int param3;
        double param4;
        System.out.println("Now, provide an integer and then a double:");
        param3 = sc.nextInt();
        param4 = sc.nextDouble();
        
        double resD = clt.multiply( param3, param4);
        System.out.println( param3 +" times "+ param4 + " equals " +resD);
    }
}