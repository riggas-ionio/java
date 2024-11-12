import java.util.Random;

public class MethodParams {

    public static void swap(int a, int b) {
        System.out.printf("(x,y)= (%d, %d) IN swap(int, int) BERORE %n", a, b);
        int temp = a;
        a=b;
        b=temp;
        System.out.printf("(x,y)= (%d, %d) IN swap(int, int) AFTER %n", a, b);
    }
    public static void swap(Point p) {
        int temp = p.x;
        p.x=p.y;
        p.y=temp;
    }
    public static void main(String[] args){
        Random rand = new Random();
        int x = rand.nextInt(50);
        int y = rand.nextInt(50);
        // System.out.printf("(x,y)= (%d, %d) before swap(int, int) %n", x, y);
        // swap(x, y);
        // System.out.printf("(x,y)= (%d, %d) after swap(int, int) %n", x, y);

        // Point p = new Point(x, y);

        // System.out.println("Point before swap(int, int) "+p);
        // swap(p.x, p.y);
        // System.out.println("Point after swap(int, int) "+p);
        // swap(p);
        // System.out.println("Point after swap(Point) "+p);
        // p.swap();
        // System.out.println("Point after swap(Point) "+p);

        Point p1 = new Point(rand.nextInt(50), rand.nextInt(50));
        Point p2 = new Point(p1.x, p1.y);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println( p1.equals(p2) );

    }
}

class Point{
  int x, y;
  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }
  public String toString() {
    return super.toString() + " ("+x+", "+y+")";
  }

  public boolean equals(Point other){
    return (this.x == other.x) && (this.y == other.y);
  }

  public void swap(){
      int temp =x;
      this.x = this.y;
      this.y = temp;
  }
}
