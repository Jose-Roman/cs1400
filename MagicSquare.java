//Jose Roman
//CS 1400
//Assignment 5
//10-23-19

public class MagicSquare {
  private int [][] numbers;
  
  public boolean Check(int [][] numbers)
  {
    boolean square = false;

    int row1 = numbers[0][0]+ numbers[0][1]+ numbers[0][2];                 //get row and column totals
    int row2 = numbers[1][0]+ numbers[1][1]+ numbers[1][2];
    int row3 = numbers[2][0]+ numbers[2][1]+ numbers[2][2];
    
    int col1 = numbers[0][0]+ numbers[1][0]+ numbers[2][0];
    int col2 = numbers[0][1]+ numbers[1][1]+ numbers[2][1];
    int col3 = numbers[0][2]+ numbers[1][2]+ numbers[2][2];
    
    int dia1 = numbers[0][0]+ numbers[1][1]+ numbers[2][2];                 //get diagonal totals
    int dia2 = numbers[2][0] + numbers[1][1]+ numbers[0][2];

    
  for(int i=0;i<3;i++)                                           //makes sure values are 1-9
     {
      for(int j=0;j<3;j++)
      {
           if((numbers[i][j]>=1 && numbers[i][j]<=9))
           {
            if((row1 == row2)&&(row2 == row3)&&(row1 == row3)&&(col1 == col2)&&(col2 == col3)&&(col1 == col3)&&(dia1 == dia2)) 
            {
             square = true;                                               //if statement returns whether or not array is a magic sqaure
            }
             else
             {
               square = false;
             }
           }
      }
     }
            return square;
  }
}