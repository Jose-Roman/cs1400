//Jose Roman
//CS1400
//Assignment 3
//9/25/2019

import java.io.*;
import java.util.Scanner;

public class TaskA
{
   public static void main(String args[])
    {
      //variables
      double startingSalary = .01;
      double endSalary = 0.0;
      int totalDays;

      //import scanner
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter number of days worked: ");
      totalDays = keyboard.nextInt();   //get amount of days worked

      System.out.println("DAY\tAMOUNT MADE");   //format table
      //variable a used for loop statement
      for(int a = 1; a <= totalDays; a++)
      {
       System.out.println(a +"\t"+ startingSalary);  //formatting table
       endSalary += startingSalary;    //total money made
       startingSalary *= 2;
      }

       System.out.println("Final Salary\t" + endSalary);   //display total amount made
    }
}
