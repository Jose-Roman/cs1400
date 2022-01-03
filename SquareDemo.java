//Jose Roman
//CS1400
//Assignment 4
//10/9/2019

import java.util.Scanner;

public class SquareDemo
{
  public static void main(String args[])
  {
   //variable to store user input values
   double number;
   
   //create new square object
   Square box = new Square();

   //get length value from user
   Scanner keyboard = new Scanner(System.in);
   System.out.println("What is the square's length? ");
   number = keyboard.nextDouble();
   
   //set the squares length
   box.setLength(number);

   //returns length value
   box.getLength();

   //shows area
   System.out.println("The square's area is " + box.getArea());
  }
}
