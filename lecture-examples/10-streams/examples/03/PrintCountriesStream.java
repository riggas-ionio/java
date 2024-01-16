import java.util.stream.Stream;

public class PrintCountriesStream{
    public static void main(String[] args){
        // Print first 3 countries begining with E
        Stream<String> countries = Stream.of("East Timor","Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia");
        countries.filter(s -> s.toUpperCase().charAt(0) == 'E')
                        .limit(3)
                        .forEach(s -> System.out.println(s));

    }
}
