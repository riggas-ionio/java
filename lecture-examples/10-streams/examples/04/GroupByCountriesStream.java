import java.util.Scanner;
import java.net.URL;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class GroupByCountriesStream{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(new URL("https://gist.githubusercontent.com/kalinchernev/486393efcca01623b18d/raw/daa24c9fea66afb7d68f8d69f0c4b8eeb9406e83/countries").openStream())){
            // Load all countries into list
            List<String> countries = new LinkedList<String>();
            while( sc.hasNext() ){
                countries.add(sc.next());
            }
            // Group countries by begining letter
            Map<Character, List<String>> countriesGrouped =
                countries.stream().collect(
                    Collectors.groupingBy(s -> s.toUpperCase().charAt(0)));
            System.out.println("Countries beginning by letter: \n"+countriesGrouped);
            // Count countries by begining letter
            Map<Character, Long> countriesGroupedCounted =
                countries.stream().collect(
                    Collectors.groupingBy(s -> s.toUpperCase().charAt(0),
                    Collectors.counting()));
            System.out.println("Number of countries beginning by letter: \n"+countriesGroupedCounted);

        }
        catch (IOException ioex){
            System.out.println(ioex);
        }
    }
}
