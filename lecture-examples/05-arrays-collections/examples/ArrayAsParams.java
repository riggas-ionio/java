import java.util.Random;

public class ArrayAsParams {

    public static Point[] fill(int size){
        Point[] spots = new Point[size];
        java.util.Random rand = new java.util.Random();
        for (int i=0; i<spots.length; i++) {
            spots[i] = new Point();
            spots[i].x = rand.nextInt(10);
            spots[i].y = rand.nextInt(10);
        }
        return spots;
    }
    public static void shift(Point[] array){ // assuming array.length>0
        Point p = array[0];
        for (int i=0; i<array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = p;
    }

    public static void main(String[] args){

        Point[] points = fill(5);
        for ( Point p: points) {
            System.out.println("Point "+p);
        }
        shift(points);
        System.out.println("==================");
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
