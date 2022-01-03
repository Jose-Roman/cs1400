//Jose Roman
//CS1400
//Assignment 1
//9/11/2019
import java.util.Scanner;

public class TaskD
{
  public static void main(String args[])
  {

    double cupSugar = 1.5/48;
    double cupButter = 1.0/48;
    double cupFlour = 2.75/48;
    double totalCookies;

    // get amount of cookies
    Scanner keyboard = new Scanner(System.in);
    System.out.print("How many cookies do you want? ");
    totalCookies = keyboard.nextDouble();

    System.out.println("Ingredients needed: ");
    System.out.println((cupSugar * totalCookies) + " cups of Sugar");
    System.out.println((cupButter * totalCookies) + " cups of Butter");
    System.out.println((cupFlour * totalCookies) + " cups of Flour");
   }
}

