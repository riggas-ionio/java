import java.util.List;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class StockJsonReader {
    public static void main(String[] args) throws IOException {
        
        Reader in = null;

        try {
            in = new InputStreamReader(StockJsonReader.class.getResourceAsStream(args[0]));
            
            Gson gson = new GsonBuilder().create();
            Type listType = new TypeToken<List<Stock>>() {}.getType();
            List<Stock> stocks = new Gson().fromJson(in, listType);
            
            for (Stock s: stocks) {
                System.out.println(s);
            }
        }
        finally {
            if (in != null) {
                in.close();
            }
        }
    }
}