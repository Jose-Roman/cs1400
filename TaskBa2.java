//Jose Roman
//CS1400
//Assignment 2
//9/18/2019

import java.util.Scanner;

public class TaskB
{
   public static void main(String args[])
     {
      //variables to get runners names

      String runnerOne;
      String runnerTwo;
      String runnerThree;

      //variables to get runners times

      double timeOne;
      double timeTwo;
      double timeThree;

      // Import scanner class

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter runner 1 name: ");
      runnerOne = sc.next();
      System.out.print("Enter runner 1 mile time in minutes: ");
      timeOne = sc.nextDouble();

      //Get values for the runners

      System.out.print("Enter runner 2 name: ");
      runnerTwo = sc.next();
      System.out.print("Enter runner 2 mile time in minutes: ");
      timeTwo = sc.nextDouble();

      System.out.print("Enter runner 3 name: ");
      runnerThree = sc.next();
      System.out.print("Enter runner 3 mile time in minutes: ");
      timeThree = sc.nextDouble();

      double x = 0.0;

      // Time One scenarios

      if(timeOne < timeTwo && timeOne < timeThree)
      {
        System.out.println(runnerOne);
        if(timeTwo < timeThree)
         {
          System.out.println(runnerTwo);
          x = 1.0;
         }
        else
         {
          System.out.println(runnerThree);
         }
         if(x==1.0)
          System.out.println(runnerThree);
         else
          System.out.println(runnerTwo);
      }

      //Time 2 scenarios

      if(timeTwo < timeOne && timeTwo < timeThree)
       {
        System.out.println(runnerTwo);
        if(timeOne < timeThree)
         {
          System.out.println(runnerOne);
          x = 1.0;
         }
        else
         {
          System.out.println(runnerThree);
         }
        if(x==1.0)
         System.out.println(runnerThree);
        else
         System.out.println(runnerOne);
      }

       //time 3 scenarios

        x = 0.0;
       if(timeThree < timeOne && timeThree < timeTwo)
       {
        System.out.println(runnerThree);
       if(timeOne < timeTwo)
       {
        System.out.println(runnerOne);
       x = 1.0;
       }
     else
      {
       System.out.println(runnerTwo);
      }
     if(x == 1.0)
      {
       System.out.println(runnerTwo);
      }
     else
       System.out.println(runnerOne);
    }
  }
}



