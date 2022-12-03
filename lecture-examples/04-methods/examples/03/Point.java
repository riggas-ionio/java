import java.util.Random;

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
  public boolean equals(Point other){
    return this.x==other.x && this.y==other.y;
  }
  public static void main(String[] args){
    System.out.println( new Point() );

    Point p1 = new Point();
    p1.x=5; p1.y=7;
    Point p2 = new Point();
    p2.x=5; p2.y=7;

    System.out.println( p1+"=="+p2+" ? "+(p1.equals(p2)));


  }
}
