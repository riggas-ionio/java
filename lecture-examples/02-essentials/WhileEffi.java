public class WhileEffi {

    public static void main(String[] args){

      int REPEAT = 300_000_000;
      long start, end;
      start = System.currentTimeMillis();

      for ( int x=0; x<REPEAT; x++ )
        for ( int y=0; y<REPEAT; y++ ) ; //nothing // just two nested loops.

      end = System.currentTimeMillis();
      System.out.println("Σύγκριση με τιμή: "+( end - start ));

      start = System.currentTimeMillis();

      for ( int x=REPEAT; x==0; x-- )
        for ( int y=REPEAT; y==0; y-- ) ; //nothing // just two nested loops.

      end = System.currentTimeMillis();
      System.out.println("Σύγκριση με μηδέν: "+ ( end - start ));
    }
}
