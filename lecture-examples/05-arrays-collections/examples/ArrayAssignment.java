import java.util.Random;

public class ArrayAssignment {

    public static int[] fill(int size){
        int[] array = new int[size];
        java.util.Random rand = new java.util.Random();
        for (int i=0; i<array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        return array;
    }

    public static void main(String[] args){

        int[] arrayA = fill(5);
        int[] arrayB = fill(3);

        System.out.println();
        for ( int i: arrayA) {
            System.out.print(" "+i);
        }
        System.out.println();
        for ( int i: arrayB) {
            System.out.print(" "+i);
        }

        arrayA = arrayB;

        System.out.println();
        for ( int i: arrayA) {
            System.out.print(" "+i);
        }

        arrayA[0] = -1;

        System.out.println();
        for ( int i: arrayB) {
            System.out.print(" "+i);
        }
    }
}
