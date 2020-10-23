import java.util.*;
import java.io.*;
import java.net.*;
import com.google.gson.*;


public class RatableVideoStreamReader {

    public static void main(String[] args) throws Exception{


        URL url = new URL(args.length>0?args[0]:"https://raw.githubusercontent.com/courses-ionio/java/master/lab-assignment-3/ratablevideo.json");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        BufferedReader json  = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        // String rvstr = json.readLine();
        Gson gson = new GsonBuilder().create();
        RatableVideo rv = gson.fromJson(json, RatableVideo.class);

        // System.out.println("Server GET: " + json.readLine());
        System.out.println( rv );
        connection.disconnect();
        // System.out.println("Disconnected from server.");

    }

}
