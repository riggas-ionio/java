import java.util.Arrays;

public class ArraysMethods {
    
    public static void main(String[] args){
        
        double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
        
        Arrays.sort(doubleArray);
        System.out.println("doubleArray: ");
        for (double value : doubleArray) {
            System.out.print(" "+value);
        }
        
        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        System.out.println("\n\nintArray: ");
        for (int value : intArray) {
            System.out.print(" "+value);
        }
        
        int[] intArrayCopy = new int[intArray.length];
        intArrayCopy = Arrays.copyOfRange(intArray, 0, intArray.length);
        System.out.println("\n\nintArrayCopy: ");
        for (int value : intArrayCopy) {
            System.out.print(" "+value);
        }
        
        System.out.println("\n\nintArray "+ ((Arrays.equals(intArray, intArrayCopy))?"==":"!=") +" intArrayCopy");
        
        int[] filledIntArray = new int[6]; 
        Arrays.fill(filledIntArray, 7); 
        System.out.println("\n\nfilledIntArray: ");
        for (int value : filledIntArray) {
            System.out.print(" "+value);
        }

        System.out.println("\n\nintArray "+ ((Arrays.equals(intArray, filledIntArray))?"==":"!=") +" filledIntArray");
        
        int location = Arrays.binarySearch(intArray, 5);
        if (location >= 0)
            System.out.println("Found 5 at element in intArray at index"+ location);
        else
            System.out.println("5 not found in intArray");

        location = Arrays.binarySearch(intArray, 10);
        if (location >= 0)
            System.out.println("Found 10 at element in intArray at index"+ location);
        else
            System.out.println("10 not found in intArray");

        System.out.println("\n\n");
    }
}