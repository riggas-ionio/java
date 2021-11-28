import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pair<String, Integer>> pairs = new ArrayList<>();
        pairs.add( new Pair<>("A", 1) );
        pairs.add( new Pair<>("B", 2) );
        pairs.add( new Pair<>("C", 3) );

        System.out.println( CollectionUtil.toString(pairs) );

        ArrayList<Pair<String, Double>> pairs2 = new ArrayList<>();
        pairs2.add( new Pair<>("A", 0.1) );
        pairs2.add( new Pair<>("B", 0.2) );
        pairs2.add( new Pair<>("C", 0.3) );

        System.out.println( CollectionUtil.toString(pairs2) );
    }
}
