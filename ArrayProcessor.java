//Jose Roman
//CS 1400
//Assignment 5
//10-23-19

public class ArrayProcessor
{
   private int numbers[][];


   //get total of array
   public int getTotal(int [][]numbers)
   {
     int total = 0;
      for(int row = 0; row < numbers.length; row++)
       {
        for(int col = 0; col < numbers[row].length; col++)
         total += numbers[row][col];
       }
     return total;
   }

   //get average
   public int getAverage(int [][]numbers)
   {
    return getTotal(numbers) / (numbers.length * numbers[0].length);
   }

   //get row total
   public int getRowTotal(int [][] numbers, int index)
   {
     int total = 0;
     for(int col = 0; col < numbers.length; col++)
       total += numbers[index][col];
       return total;
   }

   //get column total
   public int getColumnTotal(int[][]numbers,int index)
   {
     int total = 0;
     for(int row = 0; row < numbers.length; row++)
         total += numbers[row][index];
       return total;
   }

   //highest in row
   public int getHighestInRow(int[][] numbers, int row)
   {
    int highest = numbers[row][0];
    for(int i = 1; i < numbers.length;i++) 
       if(numbers[row][i] > highest)
         highest = numbers[row][i];
     return highest;
  }

  //lowest in row
  public int getLowestInRow(int[][] numbers, int row)
  {
    int lowest = numbers[row][0];
    for(int i = 1;i < numbers.length; i++)
      if(numbers[row][i] < lowest)
        lowest = numbers[row][i];
    return lowest;
  }
 
  
}



