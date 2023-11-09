public class CompFloat {

    public static void main(String[] args){

        float f1, f2;
        f1=0.001F;
        f2= 1.001F - 1.0F;
        // f2 = 0.001F;
        System.out.println("Είναι f1==f2 "+(f1==f2));

        for (float f=0.0F; f!=1.0F; f+=0.1F ) {
          System.out.println("F is "+f);
          if ( f>1.1F) break;
        }
    }
}
