import java.util.Scanner;
import java.net.URL;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Optional;

public class ProcessOptionalCountriesStream{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(new URL("https://gist.githubusercontent.com/kalinchernev/486393efcca01623b18d/raw/daa24c9fea66afb7d68f8d69f0c4b8eeb9406e83/countries").openStream())){
            // Load all countries into list
            List<String> countries = new LinkedList<String>();
            while( sc.hasNext() ){
                countries.add(sc.nextLine());
            }
            final int MIN_LENGTH = 100;
            Optional<String> str = countries.stream()
                .filter(s -> s.length()>MIN_LENGTH) // Keep longer than 3
                .map(s -> s.replaceAll(" ", "_"))
                .sorted( (s1, s2) -> s1.length() - s2.length() )
                .findFirst();

            System.out.println(str.orElse("No country with length "+MIN_LENGTH));
        }
        catch (IOException ioex){
            System.out.println(ioex);
        }
    }
}
