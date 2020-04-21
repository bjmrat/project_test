public class p

/**
   Class to accept data for circles.  Taking the information and 
   calculate area, diameter, and circumference.
*/

public class Circle
{
   private double radius;
   private final double PI = 3.14159;
   
   // No arg constructor that sets the radius field to 0.0.
   public Circle()
   {
   radius = 0.0;
   }
   
   /** 
      Constructor that accepts the radius of the circle as an argument.
      @param   r   The radius of the circle.
   */
   public Circle(double r)
   {
   radius = r;
   }
   
   /** 
      An mutator method for the radius field.
      @param   radius   The radius of the circle.
   */
   public void setRadius(double r)
   {
   radius = r;
   }
   
   /** 
      An accessor method for the radius field.
      @return   radius   The radius of the circle.
   */
   public double getRadius()
   {
   return radius;
   }
   
   /** 
      An accessor method for the area field.
      @return   area   The area of the circle.
   */
   public double getArea()
   {
   return PI * radius * radius;
   }

   /** 
      An accessor method for the diameter field.
      @return   diameter   The diameter of the circle.
   */
   public double getDiameter()
   {
   return radius * 2;
   }

   /** 
      An accessor method for the circumference field.
      @return   circumference   The circumference of the circle.
   */
   public double getCircumference()
   {
   return 2 * PI * radius;
   }
}
