//Jose Roman
//Assignment 3
//9/25/2019
import java.util.Scanner;

public class TaskC
{
   public static void main(String args[])
   {
     int storeOne;  //setup variables
     int storeTwo;
     int storeThree;
     int storeFour;
     int storeFive;

     Scanner keyboard = new Scanner(System.in);
     System.out.println("Enter Store 1 Sales for the day:");    //get sales from each store
     storeOne = keyboard.nextInt();

     System.out.println("Enter Store 2 Sales for the day:");
     storeTwo = keyboard.nextInt();

     System.out.println("Enter Store 3 Sales for the day:");
     storeThree = keyboard.nextInt();

     System.out.println("Enter Store 4 Sales for the day:");
     storeFour = keyboard.nextInt();

     System.out.println("Enter Store 5 Sales for the day:");
     storeFive = keyboard.nextInt();

     System.out.println("SALES BAR CHART");

     System.out.print("Store 1: ");          //formatting
     for (int r = 0; r < storeOne/100; r++)  //get * symbol from user input
        {
         System.out.print("*");              //print symbol for every 100 dollars
        }


     System.out.println("");                 //repeat for each store
     System.out.print("Store 2: ");
     for (int a = 0; a < storeTwo/100; a++)
        {
         System.out.print("*");
        }


     System.out.println("");
     System.out.print("Store 3: ");
     for (int b = 0; b < storeThree/100; b++)
        {
         System.out.print("*");
        }


     System.out.println("");
     System.out.print("Store 4: ");
     for(int c = 0; c < storeFour/100;c++)
        {
         System.out.print("*");
        }


     System.out.println("");
     System.out.print("Store 5: ");
     for(int d =0; d < storeFive/100;d++)
        {
         System.out.print("*");
        }
     System.out.println("");          //formatting
}
}
