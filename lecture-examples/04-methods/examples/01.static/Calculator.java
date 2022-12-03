import java.util.Scanner;

public class Calculator {
    public static int add(int i1, int i2) {
        int sum = i1 +i2;
        return sum;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int param1, param2;
        System.out.println("Provide two integers:");
        param1 = sc.nextInt();
        param2 = sc.nextInt();
        
        int res = Calculator.add( param1, param2);
        System.out.println( param1 +" plus "+ param2 + " equals " +res);
    }
}