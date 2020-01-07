import java.util.*;

public class RatableVideoTester {

    public static void main(String[] args){

        TreeSet<RatableVideo> vList = new TreeSet<RatableVideo>();

        RatableVideo v = new RatableVideo("Peaky Blinders", "Channel4", Genre.CRIME, new String[]{"English", "Greek"});
        v.setDate(2016);
        v.addRating(1);
        v.addRating(5);
        v.addRating(5);
        vList.add(v);

        RatableVideo v2 = new RatableVideo("Peaky Blinders, II", "Channel4", Genre.CRIME, new String[]{"english", "greek", "german", "italian"});
        v2.setDate(2017);
        v2.addRating(4);
        v2.addRating(5);
        // v2.addRating(7);
        vList.add(v2);

        System.out.println(vList);

        System.out.println("Successful completion.");
    }

}
