import java.util.*;
import com.google.gson.*;
import java.io.*;
import java.net.*;

public class RatableVideoToJSON {

    public static void main(String[] args){

        RatableVideo v = new RatableVideo("Peaky Blinders", "Channel4", Genre.CRIME, new String[]{"English", "Greek"});
        v.setDate(2016);
        v.addRating(1);
        v.addRating(5);
        v.addRating(5);
        
        Gson gson = new GsonBuilder().create();
        String jsonStr = gson.toJson(v);

        System.out.println(jsonStr);

        System.out.println("Successful completion.");
    }

}
