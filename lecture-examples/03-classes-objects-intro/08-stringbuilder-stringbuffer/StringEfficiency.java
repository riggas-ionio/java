import java.util.Random;
public class StringEfficiency {
    public static void main(String[] args) {
        int N = 100_000;
        long t;
        Random r = new Random();
        System.out.println("Append "+N+" times; times in millisec:");

        {
            String sb = new String();
            t = System.currentTimeMillis();
            for (int i = N; i-- > 0 ;) {
                sb = sb.concat(Integer.toString(r.nextInt(1000)));
            }
            System.out.print(sb.getClass()+": ");
            System.out.println(System.currentTimeMillis() - t);
        }

        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            for (int i = N; i-- > 0 ;) {
                sb.append(Integer.toString(r.nextInt(1000)));
            }
            System.out.print(sb.getClass()+": ");
            System.out.println(System.currentTimeMillis() - t);
        }

        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            for (int i = N; i-- > 0 ; ) {
                sb.append(Integer.toString(r.nextInt(1000)));
            }
            System.out.print(sb.getClass()+": ");
            System.out.println(System.currentTimeMillis() - t);
        }
    }
}
