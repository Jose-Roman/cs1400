//Jose Roman
//CS1400
//Assignment 4
//10/9/2019

public class Square
{
   private double length;

   public Square()
     {
      length = 0.0;
     }
   public Square(double len)
     {
      length = len;
     }

   //stores length value
   public void setLength(double len)
     {
      length = len;
     }

   //returns squares length
   public double getLength()
     {
      return length;
     }
 
   //getArea gives squares area
   public double getArea()
     {
      return length * length;
     }
}
