import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        System.out.print("Type a nutural number: n=");
        int n = (new Scanner(System.in)).nextInt();
        System.out.println("n! = "+ factorial(n));
    }

    public static long factorial(long n){
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }
}
