//Jose Roman
//CS1400
//Assignment 3
//9/25/2019

import java.util.Scanner;

public class TaskB
{
   public static void main(String args[])
     {

      //variables
      int months = 12;
      int years;
      double monthRain;
      double finalRain = 0;

      Scanner keyboard = new Scanner(System.in);
      System.out.println("How many years?");              //ask user for how many years
      years = keyboard.nextInt();
      System.out.println("Enter rainfall for each month:");
      for(int a=0;a < years; a++)                        //variable a used for loops
       {
        System.out.println("Year" + (a+1) + "amount");
        for(int b=1;b < months + 1; b++)                 //variable b used for nested loop
         {
          switch(b)                                     //switch to next loop
          {
            case 1:
            System.out.println("Month 1: ");break;      //break stops this case
            case 2 :
            System.out.println("Month 2: ");break;      //repeat for 12 months
            case 3:
            System.out.println("Month 3: ");break;
            case 4 :
            System.out.println("Month 4: ");break;
            case 5:
            System.out.println("Month 5 : ");break;
            case 6:
            System.out.println("Month 6: ");break;
            case 7:
            System.out.println("Month 7: ");break;
            case 8:
            System.out.println("Month 8: ");break;
            case 9:
            System.out.println("Month 9: ");break;
            case 10:
            System.out.println("Month 10: ");break;
            case 11:
            System.out.println("Month 11: ");break;
            case 12:
            System.out.println("Month 12: ");break;
          }
       do
         {
          //get values for each month
          monthRain = keyboard.nextDouble();
          if(monthRain < 0)
            {
             System.out.println("Enter only positive numbers:");
            }
         }

         while(monthRain < 0);
         //add all total rainfall into final rain variable
         finalRain += monthRain;
        }
     }

    //get average
    double averageRain = finalRain/(years * months);

    //display finished totals

    System.out.println("Total Months: " + (months * years));
    System.out.println("Final Rainfall: " + finalRain + "inches");
    System.out.println("Average Rainfall: " + averageRain + "inches");
   }
}

