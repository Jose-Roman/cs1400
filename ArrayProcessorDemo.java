//Jose Roman
//CS 1400
//Assignment 5
//10-23-19

public class ArrayProcessorDemo
{
   public static void main(String args[])
    {
     int [][] box = {{1,2,3},{4,5,6},{7,8,9}};
     
     ArrayProcessor demo = new ArrayProcessor();                    //create new array processor object

     System.out.println("Total: " + demo.getTotal(box));            //print total
     System.out.println("Average: " + demo.getAverage(box));        //print average

     System.out.println("Row 1 Total: " + demo.getRowTotal(box,0));         //print each row total
     System.out.println("Row 2 Total: " + demo.getRowTotal(box,1));
     System.out.println("Row 3 Total: " + demo.getRowTotal(box,2));

     System.out.println("Column 1 Total: " + demo.getColumnTotal(box,0));     //print column total
     System.out.println("Column 2 Total: " + demo.getColumnTotal(box,1));
     System.out.println("Column 3 Total: " + demo.getColumnTotal(box,2));

     System.out.println("Highest Row 1: " + demo.getHighestInRow(box,0));     //print highest
     System.out.println("Highest Row 2: " + demo.getHighestInRow(box,1));
     System.out.println("Highest Row 3: " + demo.getHighestInRow(box,2));

     System.out.println("Lowest Row 1: " + demo.getLowestInRow(box,0));       //print lowest
     System.out.println("Lowest Row 2: " + demo.getLowestInRow(box,1));  
     System.out.println("Lowest Row 3: " + demo.getLowestInRow(box,2));
}
}





