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
        Point p = new Point();

        System.out.println("Point "+p);
        swap(p.x, p.y);
        System.out.println("Point "+p);
        swap(p);
        System.out.println("Point "+p);
    }
}

class Point{
  int x, y;
  public Point(){
    Random rand = new Random();
    x = rand.nextInt(10);
    y = rand.nextInt(10);
  }
  public String toString() {
    return "("+x+","+y+")";
  }
}
