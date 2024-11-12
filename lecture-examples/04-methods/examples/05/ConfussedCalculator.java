import java.util.Scanner;

public class ConfussedCalculator {
    public double multiply(int i1, double i2) {
        double multi = i1 * i2;
        return multi;
    }
    public double multiply(double d1, int d2) {
        double multi = d1 * d2;
        return multi;
    }
    public static void main (String[] args) {
        ConfussedCalculator clt = new ConfussedCalculator();
        clt.multiply( 5, 10.0); //OK
        clt.multiply( 5.0, 10); //OK
        clt.multiply( 5, 10); //Ambibuous... compile error

    }
}
