import java.util.Scanner;

public class IntDivisor {
    
    public static int quotient(int numerator, int denominator ) { // διαιρετέος, διαιρέτης
        return numerator/denominator;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exceptionFlag = true; // συνέβη σφάλμα;
        // int n=0, d=0;
        do {
            try {
                System.out.print("Δώσε διαιρετεό: ");
                int n = sc.nextInt();
                
                System.out.print("Δώσε διαιρέτη: ");
                int d = sc.nextInt();
                
            }
            catch (java.util.InputMismatchException imex) {
                System.out.println("\nΣυνέβη ένα InputMismatchException: "+ imex);
                System.out.println("Δοκιμάστε πάλι... και αυτή τη φορά δώστε δύο ΑΚΕΡΑΙΟΥΣ!\n");
                sc.nextLine(); // Παραβλέπουμε τη λάθος είσοδο.
            }

            System.out.println("Πηλίκο: "+ quotient(n, d));
            exceptionFlag = false;

        } while (exceptionFlag);
        
        
    }
}