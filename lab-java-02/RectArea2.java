import java.util.Scanner;

public class RectArea2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the width of the rectangle: ");
        double width = in.nextDouble();
        
        System.out.print("Please enter the height of the rectangle: ");
        double height = in.nextDouble();

        double area;
        area = height*width;
        System.out.println(area);
    }
}
