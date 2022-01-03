//Jose Roman
//CS 1400
//Assignment 2
//9/18/2019
import java.util.Scanner;

public class TaskC
{
   public static void main(String args[])
   {
   // variables for user inputs
   String inputOne;
   String inputTwo;
   String inputThree;
   String inputFour;

   String y = "yes";
   Scanner keyboard = new Scanner(System.in);

   System.out.println("Reboot the computer and try to connect.");
   System.out.print("Did that fix the problem? ");
   inputOne = keyboard.nextLine();

   //get input and start if else statements
   //if input equals yes then program should stop
   //if input does not equal yes then continue program

   if(inputOne.equals(y))
   {
    System.exit(0);
   }
     else
     {
       System.out.println("Reboot the router and try to connect.");
       System.out.print("Did that fix your problem? ");
       inputTwo = keyboard.nextLine();
       if(inputTwo.equals(y))
       {
        System.exit(0);
       }
       else
       {
         System.out.println("Make sure the cables between the router and modem are plugged in firmly.");
         System.out.println("Did that fix your problem? ");
         inputThree = keyboard.nextLine();
         if(inputThree.equals(y))
         {
          System.exit(0);
         }
           else
            {
             System.out.println("Move the router to a new location and try to connect.");
             System.out.println("Did that fix your problem? ");
             inputFour = keyboard.nextLine();
             if(inputFour.equals(y))
             {
              System.exit(0);
             }
              else
              {
               System.out.println("Get a new router. ");
              }
             }
         }
      }
   }
}
