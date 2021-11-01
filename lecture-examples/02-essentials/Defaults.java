public class Defaults {
    
    static int member;
    static boolean b;
    
    public static void main(String[] args){
        int local=-1;
        
        final int f ;
        
        System.out.println(member);
        System.out.println(b);
        System.out.println(local);
        
        f = 5;
        // f = 6;
        System.out.println(f);
        int k;
        for (k = 0; k<3; k++) {
            System.out.println(k);
        }
        System.out.println(k);
    
    }
}