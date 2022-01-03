//Jose Roman
//CS1400
//Assignment 2
//9/18/2019

import java.util.Scanner;

public class TaskA
{
   public static void main(String args[])
    {
      
     // variables 

     double softwarePackage = 99.0;
     double totalPackage;
    
     // Import scanner

     Scanner keyboard = new Scanner(System.in);

     // get values
     System.out.println("How many software packages purchased? ");
     totalPackage = keyboard.nextDouble();

     if(totalPackage < 10)
     System.out.println("No discount, final price: $" + (softwarePackage * totalPackage));

     else if(totalPackage < 20)
     System.out.println("20% discount, final price: $" + (softwarePackage * totalPackage) * .80);

     else if(totalPackage < 50)
     System.out.println("30% discount, final price: $" + (softwarePackage * totalPackage) * .70);

     else if(totalPackage < 100)
     System.out.println("40% discount, final price: $" + (softwarePackage * totalPackage) * .60);

     else
     System.out.println("50% discount, final price: $" +(softwarePackage * totalPackage) * .50);
    }
}
