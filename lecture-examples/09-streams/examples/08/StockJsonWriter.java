import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StockJsonWriter {
    
    public static void main(String[] args) throws IOException{
        
        Stock obj1 = new Stock("FB","Facebook");
        obj1.setCurrentValue(100);
        obj1.setOpenningValue(263);
        
        Writer out = null;
        Gson gson = new GsonBuilder().create();

        try {
            out = new FileWriter(args[0]);
            gson.toJson(obj1, out);                          
        } finally {
            if (out != null) {
                out.close();
            }
        }
        
    }
}