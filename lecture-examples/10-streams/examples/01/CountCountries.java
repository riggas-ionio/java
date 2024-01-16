import java.util.Scanner;
import java.net.URL;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;

public class CountCountries{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(new URL("https://gist.githubusercontent.com/kalinchernev/486393efcca01623b18d/raw/daa24c9fea66afb7d68f8d69f0c4b8eeb9406e83/countries").openStream())){
            // Load all countries into list
            List<String> countries = new LinkedList<String>();
            while( sc.hasNext() ){
                countries.add(sc.next());
            }
            // Count countries begining with E
            int count = 0;
            for (String s: countries){
                if ( s.toUpperCase().charAt(0) == 'E' )
                    count++;
            }
            System.out.println("Countries beginning with 'E' count: "+count);
        }
        catch (IOException ioex){
            System.out.println(ioex);
        }
    }
}
