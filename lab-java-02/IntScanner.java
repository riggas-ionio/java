import java.util.Scanner;

public class IntScanner {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Πληκτρολογήστε ένα ακέραιο: ");
        int i1 = sc.nextInt();
        System.out.println("Πληκτρολογήσατε τον ακέραιο: "+i1);

    }
}
