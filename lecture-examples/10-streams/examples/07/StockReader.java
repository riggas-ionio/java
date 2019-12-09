import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.EOFException;

public class StockReader {
    public static void main(String[] args) throws IOException {
        
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(
                    new FileInputStream(args[0]));
                          
            while (true) {
                Stock stock = (Stock)in.readObject();
                System.out.println(stock);
            }
        }
        catch (EOFException ex) {
            // This is normal, End Of File reached
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Cannot instantiate Stock.class object (class file not found).");            
        }
        finally {
            if (in != null) {
                in.close();
            }
        }
    }
}