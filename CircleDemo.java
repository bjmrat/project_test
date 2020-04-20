importimport java.util.Scanner;
import java.util.ArrayList;

/**
   Demo for Circle class.
*/

public class CircleDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      double r = 0;
      char go;
      ArrayList<Circle> circles = new ArrayList<Circle>();
   
      // Do-while loop to allow user to keep entering data
      do     
      {
         // Ask user to input the radius of circle.
         System.out.print("Enter the circle's radius in inches: ");
         r = keyboard.nextDouble();
         
         while(r < 0)
         {
            System.out.print("Please enter a number greater than zero: ");
            r = keyboard.nextDouble();
         }
         
         // Create a Circle object and add it to the Array.
         Circle c = new Circle(r);
         circles.add(c);

         // Clear the newline left in keyboard buffer.
         keyboard.nextLine();
         
         // Ask user if they wish to continue.
         System.out.print("Enter another circle's radius? (yes/no): ");
         go = keyboard.nextLine().toUpperCase().charAt(0);
      }
      while(go == 'Y');
   
      // Iterate over the ArrayList and use instance methods to print data.
      for(int i = 0; i < circles.size(); i++)
      {
   
         System.out.println("\n\nInformation about circle " + (i+1));
         System.out.printf("Area of circle: %,.2f " + "square inches\n", circles.get(i).getArea());
         System.out.printf("Diameter of circle: %,.2f " + "inches\n", circles.get(i).getDiameter());
         System.out.printf("Circumference of circle: %,.2f " + "inches\n", circles.get(i).getCircumference());
      }
   }
}