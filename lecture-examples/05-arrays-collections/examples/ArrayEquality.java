import java.util.Random;

public class ArrayEquality {

    public static void main(String[] args){

        int[] arrayA = new int[] { 1, 2, 3, 4, 5 };
        int[] arrayB = new int[] { 1, 2, 3, 4, 5 };
        int[] arrayC = new int[] { 1, 3, 6, 9,12 };

        System.out.println(arrayA == arrayB);
        System.out.println(arrayA == arrayC);

        int[] arrayD = arrayA;
        System.out.println(arrayA == arrayD);
    }
}
