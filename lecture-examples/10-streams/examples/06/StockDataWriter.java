import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class StockDataWriter {
    public static void main(String[] args) throws IOException {
        
        String[] stocks = { "DJI", "GDAXI", "FCHI" };
        double[] lastPrices = { 19.99, 9.99, 15.99 };
        int[] units = { 12, 8, 13 };

        DataOutputStream out = null;

        try {
            out = new DataOutputStream(
                    new BufferedOutputStream(
                        new FileOutputStream(args[0])));
                          
            for (int i = 0; i < stocks.length; i ++) {
                out.writeUTF(stocks[i]);
                out.writeDouble(lastPrices[i]);
                out.writeInt(units[i]);
            }
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}