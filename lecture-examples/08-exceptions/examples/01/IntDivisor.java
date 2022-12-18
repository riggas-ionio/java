import java.util.Scanner;

public class IntDivisor {
    
    public static int quotient(int numerator, int denominator ) { // διαιρετέος, διαιρέτης
        int res = numerator/denominator;
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Δώσε διαιρετεό: ");
        int n = sc.nextInt();
        
        System.out.print("Δώσε διαιρέτη: ");
        int d = sc.nextInt();
        
        System.out.println("Πηλίκο: "+ quotient(n, d));
        
    }
}