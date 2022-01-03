//Jose Roman
//CS1400
//Assignment 1
//9/11/2019
import java.util.Scanner;

public class TaskC
{
   public static void main(String args[])
   {
      double totalMiles;
      double totalGallons;
      double finalMPG;
      Scanner keyboard = new Scanner(System.in);
      //get total miles
      System.out.print("How many miles driven? ");
      totalMiles = keyboard.nextDouble();
      // get gallons
      System.out.print("How many gallons of gas used? ");
      totalGallons = keyboard.nextDouble();

      finalMPG = totalMiles / totalGallons;

      //display info
      System.out.println("Total miles per gallon is " + finalMPG);
      }
}


