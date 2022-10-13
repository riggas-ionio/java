public class Blocks {
    
    public static void main(String[] args){
        int i = 100000; 
        {
            int i2 = i+1; 
            System.out.println(i2);
        }

        System.out.println(i);
    }
}