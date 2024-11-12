import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StockJsonWriter {
    
    public static void main(String[] args) throws IOException{
        
        List<Stock> stocks = new ArrayList<Stock>();
        
        Stock Obj1 = new Stock("FB","Facebook");
        Obj1.setCurrentValue(100);
        Obj1.setOpenningValue(263);
        
        Stock Obj2 = new Stock("YT","Youtube");
        Obj2.setCurrentValue(678);
        Obj2.setOpenningValue(453);
        
        Stock Obj3 = new Stock("MC","Microsoft");
        Obj3.setCurrentValue(555);
        Obj3.setOpenningValue(444);
        
        Stock Obj4 = new Stock("YH","Yahoo");
        Obj4.setCurrentValue(1833);
        Obj4.setOpenningValue(4523);
        
        Stock Obj5 = new Stock("COCA","COCA COLA");
        Obj5.setCurrentValue(347);
        Obj5.setOpenningValue(68);
        
        stocks.add(Obj1);
        stocks.add(Obj2);
        stocks.add(Obj3);
        stocks.add(Obj4);
        stocks.add(Obj5);
        
        Writer out = null;
        Gson gson = new GsonBuilder().create();

        try {
            out = new FileWriter(args[0]);
            gson.toJson(stocks, out);                          
        } finally {
            if (out != null) {
                out.close();
            }
        }
        
    }
}