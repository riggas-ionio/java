import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.EOFException;

public class StockDataReader {
    public static void main(String[] args) throws IOException {
        
        DataInputStream in = null;

        try {
            in = new DataInputStream(
                    new BufferedInputStream(
                        new FileInputStream(args[0])));
                          
            while (true) {
                String stock = in.readUTF();
                double lastPrice = in.readDouble();
                int units = in.readInt();
                
                System.out.format("Stock %s \tlast price %5.3f\tunits %d\n", stock, lastPrice, units);
            }
        }
        catch (EOFException e) {
            // This is normal, End Of File reached
        }
        finally {
            if (in != null) {
                in.close();
            }
        }
    }
}