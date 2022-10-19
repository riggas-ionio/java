import java.util.Scanner;
import java.lang.Math;

public class Lines {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double length;

        length=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.println(length);
    }

    
}
