public class Box
{
   private double height;
   private double width;
   private double depth;

   /**
      Constructs a box with a given side length.
      @param sideLength the length of each side
   */   
   public Box(double h, double w, double d)
   {
      // your work here
      height=h;
      width=w;
      depth=d;
   }

   /**
      Gets the volume of this box.
      @return the volume
   */
   public double volume()
   {
      // your work here
     return height*width*depth;
   }
   
   /**
      Gets the surface area of this box.
      @return the surface area
   */
   public double surfaceArea()
   {
      // your work here
      
      return 2*(width*height+height*depth+depth*width);
   }
}