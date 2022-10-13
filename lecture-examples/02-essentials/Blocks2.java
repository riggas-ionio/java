public class Blocks2 {
    
    public static void main(String[] args){
        int i = 100000; 
        int i2 = i+1; 
        {
            int i3 = i2+1; 
            System.out.println(i3);
        }

        System.out.println(i2);
        System.out.println(i);
        
    }
}