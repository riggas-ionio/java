import java.util.Random;

public class ArrayObjectsLoop {

    public static void main(String[] args){

        Point[] points = new Point[5];
        java.util.Random rand = new java.util.Random();
        for (int i=0; i<points.length; i++) {
            points[i] = new Point();
            points[i].x = rand.nextInt(10);
            points[i].y = rand.nextInt(10);
        }

        for ( Point p: points) {
            System.out.println("Point "+p);
        }

    }
}

class Point{
  int x, y;
  public String toString() {
    return "("+x+","+y+")";
  }
}
