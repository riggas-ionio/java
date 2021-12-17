import java.util.Scanner;

public class IntDivisor {

    public static int quotient(int numerator, int denominator ) throws ArithmeticException
    {
        if (  denominator == 0 )
            throw new ArithmeticException("Denominator cannot be zero (/0)!");
        return numerator/denominator;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exceptionFlag = true; // exception occured?
        do {
            try {
                System.out.print("Give numarator: ");
                int n = sc.nextInt();

                System.out.print("Give denominator: ");
                int d = sc.nextInt();

                System.out.println("Quotient: "+ quotient(n, d));
                exceptionFlag = false;
            }
            catch (ArithmeticException aex) {
                System.out.println("\nArithmeticException: "+ aex);
                System.out.println("Try again; remember do not devide by zero!\n");
                //System.exit(-1); // Is finally block executed - Does do..while iteration continue?
                 //return; // Is finally block executed - Does do..while iteration continue?
            }
            /* Not catching InputMismatchExceptions; try a floating point input - is finally block executed?
            catch (java.util.InputMismatchException imex) {
                System.out.println("\nInputMismatchException: "+ imex);
                System.out.println("Try agaon, this time providing two INTEGERs!\n");
                sc.nextLine(); // Clear input buffer.
            }*/
            finally {
                System.out.println("Do not forget there may be a division remainder!");
            }

        } while (exceptionFlag);


    }
}
