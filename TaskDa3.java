//Jose Roman
//CS1400
//Assignment 3
//9/25/2019
import java.util.Scanner;
import java.io.*;

public class TaskD
{
  public static void main(String args[]) throws IOException
  {
      int lineNumber = 1;
      String fileLocation;

      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter the file name:");
      fileLocation = keyboard.nextLine();

      File file = new File(fileLocation);
      Scanner inputFile = new Scanner(file);

      while(inputFile.hasNext())
        {
         System.out.println(lineNumber + ": " + inputFile.nextLine());
         lineNumber += 1;
        }
     }
}

