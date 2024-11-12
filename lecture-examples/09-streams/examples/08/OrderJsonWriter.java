import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class OrderJsonWriter {

    public static void main(String[] args) throws IOException{

        Order obj1 = new Order("Bike", 100, 1);

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
