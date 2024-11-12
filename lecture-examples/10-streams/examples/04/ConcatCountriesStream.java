import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.net.URL;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;


public class ConcatCountriesStream{
    public static void main(String[] args){
        // Print first 3 countries begining with E
        try(Scanner sc = new Scanner(new URL("https://gist.githubusercontent.com/kalinchernev/486393efcca01623b18d/raw/daa24c9fea66afb7d68f8d69f0c4b8eeb9406e83/countries").openStream())){
            List<String> countries = new LinkedList<String>();
            while( sc.hasNext() ){
                countries.add(sc.next());
            }

            String str = countries.stream().filter(s -> s.toUpperCase().charAt(0) == 'E')
                            .limit(3)
                            .collect(Collectors.joining(", "));
            System.out.println(str);
        }
        catch (IOException ioex){
            System.out.println(ioex);
        }

    }
}
