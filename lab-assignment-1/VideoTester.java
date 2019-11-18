import java.util.*;

public class VideoTester {

    public static void main(String[] args){
        Video v = new Video("Peaky Blinders", "Channel4", Gerne.CRIME, new String[]{"English", "Greek"});
        v.setDate(2016);
        System.out.println(v);

        Collection l = v.getLanguages();
        System.out.println("Languages: "+l);
        l.clear();
        System.out.println("Languages: "+l);
        System.out.println(v);

        Video v2 = new Video("Peaky Blinders, II", "Channel4", Gerne.CRIME, new String[]{"english", "greek", "german", "italian"});
        v2.setDate(2017);

        System.out.println(v2);

        System.out.println(v.equals(v2));
        System.out.println(v.equals(new Video("Peaky Blinders", "Channel4", Gerne.CRIME, new String[]{"english", "greek", "german", "italian"})));
        Video v3 = new Video("Peaky Blinders", "Channel4", Gerne.CRIME, new String[]{"english", "greek", "german", "italian"});
        v3.setDate(1106);
        v3.setDate(2106);
        v3.setDate(2016);
        System.out.println(v.equals(v3));
        System.out.println(v3);

    }

}
