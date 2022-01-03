//Jose Roman
//CS1400
//Assignment 6
//10-30-19 

import java.util.Scanner;

public class TriviaGame 
{
  public static void main(String[] args)
  {
    final int totalQuestions = 10;         //size of array
    int player1 = 0;
    int player2 = 0;
    
  
    Scanner keyboard = new Scanner(System.in);
    
    Question[] demo = new Question[totalQuestions];          //creates new question object
    
    //input questions into array
    demo[0]= new Question("Who was the 1st pick in the 1996 NBA Draft?","Kobe Bryant", "Allen Iverson", "Steve Nash", "Ray Allen",2);
    demo[1]= new Question("Who was the 2009 NBA MVP?", "Dwyane Wade","Kobe Bryant","LeBron James","Dwight Howard",3);
    demo[2]= new Question("Who was the 1988 Finals MVP?","Magic Johnson", "Isiah Thomas","Joe Dumars","James Worthy",4);
    demo[3]= new Question("Who was the 2016 Rookie of the Year?", "Karl-Anthony Towns", "Devin Booker","Kristaps Porzingus","D'Angelo Russell",1);
    demo[4]= new Question("Who was the 2011 6th Man of the Year?","Jamal Crawford","Jason Terry","Lamar Odom","James Harden",3);
    demo[5]= new Question("Who was the 2007 Finals MVP","Tim Duncan","LeBron James","Tony Parker","Manu Ginobili",3);
    demo[6]= new Question("Who was the 1997 NBA MVP?","Michael Jordan","Karl Malone","Hakeem Olajuwon","Grant Hill",2);
    demo[7]= new Question("Who was the 2011 Rookie of the Year?","Blake Griffin","John Wall","DeMarcus Cousins", "Greg Monroe", 1);
    demo[8]= new Question("Who was the 1st pick in the 1982 NBA Draft?","Dominique Wilkins","James Worthy","Fat Lever","Terry Cummings",2);
    demo[9]= new Question("Who was the 2016 Most Improved Player?","Stephen Curry","Giannis Antetokounmpo","Kemba Walker","CJ McCollum",4);
    
    System.out.println("Player 1 Turn:");
    
    for(int index = 0; index < demo.length/2;index++)     //for loop for player 1
    {
      System.out.println(demo[index].getQuestion());
      System.out.println("1. " + demo[index].getChoice1());
      System.out.println("2. " + demo[index].getChoice2());
      System.out.println("3. " + demo[index].getChoice3());
      System.out.println("4. " + demo[index].getChoice4());
      System.out.println("Select Answer: ");
      int userChoice = keyboard.nextInt();
      
      if(demo[index].getAnswer()== userChoice)
        {
        player1++;                                  //adds one for correct answer
        }
    }
    
    System.out.println("Player 2 Turn:");
    
    for(int index = demo.length/2; index < demo.length; index++)
    {
      System.out.println(demo[index].getQuestion());
      System.out.println("1. " + demo[index].getChoice1());
      System.out.println("2. " + demo[index].getChoice2());
      System.out.println("3. " + demo[index].getChoice3());
      System.out.println("4. " + demo[index].getChoice4());
      System.out.println("Select Answer: ");
      int userChoice = keyboard.nextInt();
      
      if(demo[index].getAnswer()== userChoice)
        {
        player2++;
        }
    }
    
    System.out.println("Player 1 Score: "+ player1);      //print player scores
    System.out.println("Player 2 Score: "+ player2);
    
  if(player1 > player2)
    System.out.println("Player 1 wins!");               //prints winner
    else if(player2 > player1)
      System.out.println("Player 2 wins!");
    else
      System.out.println("Players tied.");
  }
}
