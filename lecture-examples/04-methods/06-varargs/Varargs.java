public class Varargs {
    public static long sumall(int ... n){
        long sum = 0;
        for( int i: n)
            sum += i;
        return sum;
    }
    public static void main(String[] args){
        System.out.println("Sum of - is: "+ sumall());
        System.out.println("Sum of 1 is: "+ sumall(1));
        System.out.println("Sum of 1, 2 is: "+ sumall(1, 2));
        System.out.println("Sum of 1, 2, 3 is: "+ sumall(1, 2, 3));
        System.out.println("Sum of 1, 2, 3, 4 is: "+ sumall(1, 2, 3, 4));
        System.out.println("Sum of 1, 2, 3, 4, 5 is: "+ sumall(1, 2, 3, 4, 5));
    }

}
