import java.util.Scanner;

public class Arrays {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Πληκτρολογήστε το πλήθος των φοιτητών: ");
        int sc_count = sc.nextInt();

        String[] students = new String[sc_count];
        System.out.println( students );

        String[] class_names = {"Sem-A", "Sem-B"};
        System.out.println( class_names );

        int[] nums;
        nums = {5, 6, 7}; // Compile error!!!
        // int[] nums = {5, 6, 7}; // FIXED: Compile error!!!
        System.out.println( nums[0] );

        int x=0, y=1;
        String[] names = new String[10], surnames = new String[10];
        System.out.println(names[0]);

    }
}
