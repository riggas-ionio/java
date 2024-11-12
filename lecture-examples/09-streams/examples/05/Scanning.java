import java.io.*;
import java.util.Scanner;

public class Scanning {
    public static void main(String[] args) 
	throws IOException {

        Scanner sc = null;

        try {
            sc = new Scanner(
                	new BufferedReader(
                    	new FileReader(args[0])));
            int doubles=0, strings=0;
            while (sc.hasNext()) {
                if (sc.hasNextDouble()) {
                    sc.nextDouble();
                    doubles++;
                } else {
                    sc.next();
                    strings++;
                }   
            }
            System.out.format("Κείμενα: \t\t\t%10d\n", strings);
            System.out.format("Αριθμοί κινητής υποδιαστολής: \t%10d\n\n", doubles);
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}

