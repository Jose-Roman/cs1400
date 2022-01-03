//Jose Roman
//CS1400
//Assignment 6
//10-30-19 

public class Question 
   {
     private String question;                  //set variables
     private String choice1;
     private String choice2;
     private String choice3;
     private String choice4;
     private int correctAnswer;
  
   public Question(String askQuestion,String answer1,String answer2,String answer3,String answer4,int rightAnswer)
   {
     question = askQuestion;
     choice1 = answer1;
     choice2 = answer2;
     choice3 = answer3;
     choice4 = answer4;
     correctAnswer = rightAnswer;
   }
  public void setQuestion(String askQuestion)     //set question
  {
    question = askQuestion;
  }
  public String getQuestion()                    //get question
  {
    return question;
  }
  
  public void setChoice1(String answer1)          //set choice
  {
    choice1 = answer1;
  }
  public void setChoice2(String answer2)         
  {
    choice2 = answer2;
  }
  public void setChoice3(String answer3)
  {
    choice3 = answer3;
  }
  public void setChoice4(String answer4)
  {
    choice4 = answer4;
  }
  
  public String getChoice1()                        //get choice
  {
    return choice1;
  }  
   public String getChoice2()
  {
    return choice2;
  } 
   public String getChoice3()
  {
    return choice3;
  } 
   public String getChoice4()
  {
    return choice4;
  } 
  
  public void setAnswer(int rightAnswer)           //set answer
  {
    correctAnswer = rightAnswer;
  }
  public int getAnswer()                     //get answer
  {
    return correctAnswer;
  }
}
    