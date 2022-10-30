import java.util.Random;

public class MethodParams {

    public static void swap(int a, int b) {
        int temp = a;
        a=b;
        b=a;
    }
    public static void swap(Point p) {
        int temp = p.x;
        p.x=p.y;
        p.y=temp;
    }
    public static void main(String[] args){
        Random rand = new Random();
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        System.out.printf("(x,y)= (%d, %d) before swap(int, int) %n", x, y);
        swap(x, y);
        System.out.printf("(x,y)= (%d, %d) after swap(int, int) %n", x, y);

        Point p = new Point(x, y);

        System.out.println("Point before swap(int, int) "+p);
        swap(p.x, p.y);
        System.out.println("Point after swap(int, int) "+p);
        swap(p);
        System.out.println("Point after swap(Point) "+p);
        p.swap();
        System.out.println("Point after swap(Point) "+p);
    }
}

class Point{
  int x, y;
  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }
  public String toString() {
    return "("+x+", "+y+")";
  }
  public void swap(){
      int temp =x;
      this.x = this.y;
      this.y = temp;
  }
}
