import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StockJsonReader {
    public static void main(String[] args) throws IOException {
        
        Reader in = null;

        try {
            in = new InputStreamReader(StockJsonReader.class.getResourceAsStream(args[0]));
            
            Gson gson = new GsonBuilder().create();
            Stock s = new Gson().fromJson(in, Stock.class);
            
            System.out.println(s);
        }
        finally {
            if (in != null) {
                in.close();
            }
        }
    }
}