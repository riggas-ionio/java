public class EqualsString {
    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";
        final String const_lo = "lo";
        System.out.println((hello == "Hello"));
        System.out.println((Other.hello == hello));
        System.out.println((hello == ("Hel"+"lo")));
        System.out.println((hello == ("Hel"+lo)));
        System.out.println((hello == ("Hel"+const_lo)));
    }
}
class Other { static String hello = "Hello"; }
