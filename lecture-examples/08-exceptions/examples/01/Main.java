import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Δώσε διαιρετεό: ");
        int n = sc.nextInt();
        
        System.out.print("Δώσε διαιρέτη: ");
        int d = sc.nextInt();
        
        System.out.println("Πηλίκο: "+ IntDivisor.quotient(n, d));
        
    }
}