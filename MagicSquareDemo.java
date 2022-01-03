//Jose Roman
//CS 1400
//Assignment 5
//10-23-19

public class MagicSquareDemo 
{
  public static void main(String[] args) 
  {
    int[][] arrayOne = {{4,9,2},{3,5,7},{8,1,6}};         //magic square array
    
    MagicSquare demo = new MagicSquare();                //create new Magic Square object
    
    System.out.println("Array One is a Magic Square: " + demo.Check(arrayOne));    //check to see if Check works
    
    int[][] arrayTwo = {{10,3,2},{4,5,6},{12,2,1}};                     //test array
    
    System.out.println("Array Two is a Magic Square: " + demo.Check(arrayTwo));

    int[][] arrayThree = {{1,2,3},{4,5,6},{7,8,9}};

    System.out.println("Array Three is a Magic Square: " + demo.Check(arrayThree));
      
  }
}