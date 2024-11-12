public class Literals {
    
    static byte b;
    static short s;
    static int i;
    static long l;

    static float f;
    static double d, d2;
    
    
    public static void main(String[] args){
        int i = 100000;
        long l = 100000L;
        byte b = (byte)127;
        short s = (short) 32000;
        
        float f = 123.4F;
        double d = 123.4000;
        double d2 = 1.234e2;
        
        long l2 = 317_000_000_000L;

        char capitalC = 'C';
        char lowerC = 'c';
        
        char sQuotes = '\''; 
        char dQuotes = '\"'; 

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(s);

        System.out.println(f);
        System.out.println(d);
        System.out.println(d2);
        
        System.out.println(l2);
 
        System.out.println(capitalC);
        System.out.println(lowerC);
        
        System.out.println(sQuotes);
        System.out.println(dQuotes);
    }
}